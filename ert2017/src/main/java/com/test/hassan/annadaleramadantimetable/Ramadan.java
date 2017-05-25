package com.test.hassan.annadaleramadantimetable;

/**
 * Created by Hassan on 22-May-17.
 */

public class Ramadan {

    private int _id;
    private String _day;
    private String _date;
    private String _sehri;
    private String _sunrise;
    private String _zuhr;
    private String _asr;
    private String _iftar;
    private String _isha;

    public Ramadan(){
    }

    public Ramadan(int id, String day, String date, String sehri, String sunrise, String zuhr, String asr, String iftar, String isha){
        this._id = id;
        this._day = day;
        this._date = date;
        this._sehri = sehri;
        this._sunrise = sunrise;
        this._zuhr = zuhr;
        this._asr = asr;
        this._iftar = iftar;
        this._isha = isha;
    }

    public Ramadan(String day, String date, String sehri, String sunrise, String zuhr, String asr, String iftar, String isha){
        this._day = day;
        this._date = date;
        this._sehri = sehri;
        this._sunrise = sunrise;
        this._zuhr = zuhr;
        this._asr = asr;
        this._iftar = iftar;
        this._isha = isha;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_day(String _day){
        this._day = _day;
    }

    public void set_date(String _date) {
        this._date = _date;
    }

    public void set_sehri(String _sehri) {
        this._sehri = _sehri;
    }

    public void set_sunrise(String _sunrise) {
        this._sunrise = _sunrise;
    }

    public void set_zuhr(String _zuhr) {
        this._zuhr = _zuhr;
    }

    public void set_asr(String _asr) {
        this._asr = _asr;
    }

    public void set_iftar(String _iftar) {
        this._iftar = _iftar;
    }

    public void set_isha(String _isha) {
        this._isha = _isha;
    }

    public int get_id() {
        return _id;
    }

    public String get_day() {
        return _day;
    }

    public String get_date() {
        return _date;
    }

    public String get_sehri() {
        return _sehri;
    }

    public String get_sunrise() {
        return _sunrise;
    }

    public String get_zuhr() {
        return _zuhr;
    }

    public String get_asr() {
        return _asr;
    }

    public String get_iftar() {
        return _iftar;
    }

    public String get_isha() {
        return _isha;
    }
}
