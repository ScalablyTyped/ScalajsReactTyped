package typingsJapgolly.adhan

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.adhan.adhanStrings.AqrabYaum
import typingsJapgolly.adhan.adhanStrings.Unresolved
import typingsJapgolly.adhan.adhanStrings.abyad
import typingsJapgolly.adhan.adhanStrings.ahmer
import typingsJapgolly.adhan.adhanStrings.asr
import typingsJapgolly.adhan.adhanStrings.dhuhr
import typingsJapgolly.adhan.adhanStrings.fajr
import typingsJapgolly.adhan.adhanStrings.general
import typingsJapgolly.adhan.adhanStrings.hanafi
import typingsJapgolly.adhan.adhanStrings.isha
import typingsJapgolly.adhan.adhanStrings.maghrib
import typingsJapgolly.adhan.adhanStrings.middleofthenight
import typingsJapgolly.adhan.adhanStrings.nearest
import typingsJapgolly.adhan.adhanStrings.none
import typingsJapgolly.adhan.adhanStrings.seventhofthenight
import typingsJapgolly.adhan.adhanStrings.shafi
import typingsJapgolly.adhan.adhanStrings.sunrise
import typingsJapgolly.adhan.adhanStrings.twilightangle
import typingsJapgolly.adhan.adhanStrings.up
import typingsJapgolly.adhan.libTypesCoordinatesMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abyad extends StObject {
    
    val Abyad: abyad
    
    val Ahmer: ahmer
    
    val General: general
  }
  object Abyad {
    
    inline def apply(): Abyad = {
      val __obj = js.Dynamic.literal(Abyad = "abyad", Ahmer = "ahmer", General = "general")
      __obj.asInstanceOf[Abyad]
    }
    
    extension [Self <: Abyad](x: Self) {
      
      inline def setAbyad(value: abyad): Self = StObject.set(x, "Abyad", value.asInstanceOf[js.Any])
      
      inline def setAhmer(value: ahmer): Self = StObject.set(x, "Ahmer", value.asInstanceOf[js.Any])
      
      inline def setGeneral(value: general): Self = StObject.set(x, "General", value.asInstanceOf[js.Any])
    }
  }
  
  trait AqrabBalad extends StObject {
    
    val AqrabBalad: typingsJapgolly.adhan.adhanStrings.AqrabBalad
    
    val AqrabYaum: typingsJapgolly.adhan.adhanStrings.AqrabYaum
    
    val Unresolved: typingsJapgolly.adhan.adhanStrings.Unresolved
  }
  object AqrabBalad {
    
    inline def apply(): AqrabBalad = {
      val __obj = js.Dynamic.literal(AqrabBalad = "AqrabBalad", AqrabYaum = "AqrabYaum", Unresolved = "Unresolved")
      __obj.asInstanceOf[AqrabBalad]
    }
    
    extension [Self <: AqrabBalad](x: Self) {
      
      inline def setAqrabBalad(value: typingsJapgolly.adhan.adhanStrings.AqrabBalad): Self = StObject.set(x, "AqrabBalad", value.asInstanceOf[js.Any])
      
      inline def setAqrabYaum(value: AqrabYaum): Self = StObject.set(x, "AqrabYaum", value.asInstanceOf[js.Any])
      
      inline def setUnresolved(value: Unresolved): Self = StObject.set(x, "Unresolved", value.asInstanceOf[js.Any])
    }
  }
  
  trait Asr extends StObject {
    
    var asr: Double
    
    var dhuhr: Double
    
    var fajr: Double
    
    var isha: Double
    
    var maghrib: Double
    
    var sunrise: Double
  }
  object Asr {
    
    inline def apply(asr: Double, dhuhr: Double, fajr: Double, isha: Double, maghrib: Double, sunrise: Double): Asr = {
      val __obj = js.Dynamic.literal(asr = asr.asInstanceOf[js.Any], dhuhr = dhuhr.asInstanceOf[js.Any], fajr = fajr.asInstanceOf[js.Any], isha = isha.asInstanceOf[js.Any], maghrib = maghrib.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Asr]
    }
    
    extension [Self <: Asr](x: Self) {
      
      inline def setAsr(value: Double): Self = StObject.set(x, "asr", value.asInstanceOf[js.Any])
      
      inline def setDhuhr(value: Double): Self = StObject.set(x, "dhuhr", value.asInstanceOf[js.Any])
      
      inline def setFajr(value: Double): Self = StObject.set(x, "fajr", value.asInstanceOf[js.Any])
      
      inline def setIsha(value: Double): Self = StObject.set(x, "isha", value.asInstanceOf[js.Any])
      
      inline def setMaghrib(value: Double): Self = StObject.set(x, "maghrib", value.asInstanceOf[js.Any])
      
      inline def setSunrise(value: Double): Self = StObject.set(x, "sunrise", value.asInstanceOf[js.Any])
    }
  }
  
  trait Coordinates extends StObject {
    
    var coordinates: default
    
    var date: js.Date
    
    var solarTime: typingsJapgolly.adhan.libTypesSolarTimeMod.default
    
    var tomorrow: js.Date
    
    var tomorrowSolarTime: typingsJapgolly.adhan.libTypesSolarTimeMod.default
  }
  object Coordinates {
    
    inline def apply(
      coordinates: default,
      date: js.Date,
      solarTime: typingsJapgolly.adhan.libTypesSolarTimeMod.default,
      tomorrow: js.Date,
      tomorrowSolarTime: typingsJapgolly.adhan.libTypesSolarTimeMod.default
    ): Coordinates = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], solarTime = solarTime.asInstanceOf[js.Any], tomorrow = tomorrow.asInstanceOf[js.Any], tomorrowSolarTime = tomorrowSolarTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinates]
    }
    
    extension [Self <: Coordinates](x: Self) {
      
      inline def setCoordinates(value: default): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setSolarTime(value: typingsJapgolly.adhan.libTypesSolarTimeMod.default): Self = StObject.set(x, "solarTime", value.asInstanceOf[js.Any])
      
      inline def setTomorrow(value: js.Date): Self = StObject.set(x, "tomorrow", value.asInstanceOf[js.Any])
      
      inline def setTomorrowSolarTime(value: typingsJapgolly.adhan.libTypesSolarTimeMod.default): Self = StObject.set(x, "tomorrowSolarTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dhuhr extends StObject {
    
    val Asr: asr
    
    val Dhuhr: dhuhr
    
    val Fajr: fajr
    
    val Isha: isha
    
    val Maghrib: maghrib
    
    val None: none
    
    val Sunrise: sunrise
  }
  object Dhuhr {
    
    inline def apply(): Dhuhr = {
      val __obj = js.Dynamic.literal(Asr = "asr", Dhuhr = "dhuhr", Fajr = "fajr", Isha = "isha", Maghrib = "maghrib", None = "none", Sunrise = "sunrise")
      __obj.asInstanceOf[Dhuhr]
    }
    
    extension [Self <: Dhuhr](x: Self) {
      
      inline def setAsr(value: asr): Self = StObject.set(x, "Asr", value.asInstanceOf[js.Any])
      
      inline def setDhuhr(value: dhuhr): Self = StObject.set(x, "Dhuhr", value.asInstanceOf[js.Any])
      
      inline def setFajr(value: fajr): Self = StObject.set(x, "Fajr", value.asInstanceOf[js.Any])
      
      inline def setIsha(value: isha): Self = StObject.set(x, "Isha", value.asInstanceOf[js.Any])
      
      inline def setMaghrib(value: maghrib): Self = StObject.set(x, "Maghrib", value.asInstanceOf[js.Any])
      
      inline def setNone(value: none): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
      
      inline def setSunrise(value: sunrise): Self = StObject.set(x, "Sunrise", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dubai extends StObject {
    
    def Dubai(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def Egyptian(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def Karachi(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def Kuwait(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def MoonsightingCommittee(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def MuslimWorldLeague(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def NorthAmerica(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def Other(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def Qatar(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def Singapore(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def Tehran(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def Turkey(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
    
    def UmmAlQura(): typingsJapgolly.adhan.libTypesCalculationParametersMod.default
  }
  object Dubai {
    
    inline def apply(
      Dubai: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      Egyptian: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      Karachi: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      Kuwait: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      MoonsightingCommittee: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      MuslimWorldLeague: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      NorthAmerica: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      Other: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      Qatar: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      Singapore: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      Tehran: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      Turkey: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default],
      UmmAlQura: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]
    ): Dubai = {
      val __obj = js.Dynamic.literal(Dubai = Dubai.toJsFn, Egyptian = Egyptian.toJsFn, Karachi = Karachi.toJsFn, Kuwait = Kuwait.toJsFn, MoonsightingCommittee = MoonsightingCommittee.toJsFn, MuslimWorldLeague = MuslimWorldLeague.toJsFn, NorthAmerica = NorthAmerica.toJsFn, Other = Other.toJsFn, Qatar = Qatar.toJsFn, Singapore = Singapore.toJsFn, Tehran = Tehran.toJsFn, Turkey = Turkey.toJsFn, UmmAlQura = UmmAlQura.toJsFn)
      __obj.asInstanceOf[Dubai]
    }
    
    extension [Self <: Dubai](x: Self) {
      
      inline def setDubai(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "Dubai", value.toJsFn)
      
      inline def setEgyptian(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "Egyptian", value.toJsFn)
      
      inline def setKarachi(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "Karachi", value.toJsFn)
      
      inline def setKuwait(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "Kuwait", value.toJsFn)
      
      inline def setMoonsightingCommittee(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "MoonsightingCommittee", value.toJsFn)
      
      inline def setMuslimWorldLeague(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "MuslimWorldLeague", value.toJsFn)
      
      inline def setNorthAmerica(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "NorthAmerica", value.toJsFn)
      
      inline def setOther(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "Other", value.toJsFn)
      
      inline def setQatar(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "Qatar", value.toJsFn)
      
      inline def setSingapore(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "Singapore", value.toJsFn)
      
      inline def setTehran(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "Tehran", value.toJsFn)
      
      inline def setTurkey(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "Turkey", value.toJsFn)
      
      inline def setUmmAlQura(value: CallbackTo[typingsJapgolly.adhan.libTypesCalculationParametersMod.default]): Self = StObject.set(x, "UmmAlQura", value.toJsFn)
    }
  }
  
  trait Fajr extends StObject {
    
    var fajr: Double
    
    var isha: Double
  }
  object Fajr {
    
    inline def apply(fajr: Double, isha: Double): Fajr = {
      val __obj = js.Dynamic.literal(fajr = fajr.asInstanceOf[js.Any], isha = isha.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fajr]
    }
    
    extension [Self <: Fajr](x: Self) {
      
      inline def setFajr(value: Double): Self = StObject.set(x, "fajr", value.asInstanceOf[js.Any])
      
      inline def setIsha(value: Double): Self = StObject.set(x, "isha", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hanafi extends StObject {
    
    val Hanafi: hanafi
    
    val Shafi: shafi
  }
  object Hanafi {
    
    inline def apply(): Hanafi = {
      val __obj = js.Dynamic.literal(Hanafi = "hanafi", Shafi = "shafi")
      __obj.asInstanceOf[Hanafi]
    }
    
    extension [Self <: Hanafi](x: Self) {
      
      inline def setHanafi(value: hanafi): Self = StObject.set(x, "Hanafi", value.asInstanceOf[js.Any])
      
      inline def setShafi(value: shafi): Self = StObject.set(x, "Shafi", value.asInstanceOf[js.Any])
    }
  }
  
  trait MiddleOfTheNight extends StObject {
    
    val MiddleOfTheNight: middleofthenight
    
    val SeventhOfTheNight: seventhofthenight
    
    val TwilightAngle: twilightangle
    
    def recommended(coordinates: default): middleofthenight | seventhofthenight
  }
  object MiddleOfTheNight {
    
    inline def apply(recommended: default => middleofthenight | seventhofthenight): MiddleOfTheNight = {
      val __obj = js.Dynamic.literal(MiddleOfTheNight = "middleofthenight", SeventhOfTheNight = "seventhofthenight", TwilightAngle = "twilightangle", recommended = js.Any.fromFunction1(recommended))
      __obj.asInstanceOf[MiddleOfTheNight]
    }
    
    extension [Self <: MiddleOfTheNight](x: Self) {
      
      inline def setMiddleOfTheNight(value: middleofthenight): Self = StObject.set(x, "MiddleOfTheNight", value.asInstanceOf[js.Any])
      
      inline def setRecommended(value: default => middleofthenight | seventhofthenight): Self = StObject.set(x, "recommended", js.Any.fromFunction1(value))
      
      inline def setSeventhOfTheNight(value: seventhofthenight): Self = StObject.set(x, "SeventhOfTheNight", value.asInstanceOf[js.Any])
      
      inline def setTwilightAngle(value: twilightangle): Self = StObject.set(x, "TwilightAngle", value.asInstanceOf[js.Any])
    }
  }
  
  trait Nearest extends StObject {
    
    val Nearest: nearest
    
    val None: none
    
    val Up: up
  }
  object Nearest {
    
    inline def apply(): Nearest = {
      val __obj = js.Dynamic.literal(Nearest = "nearest", None = "none", Up = "up")
      __obj.asInstanceOf[Nearest]
    }
    
    extension [Self <: Nearest](x: Self) {
      
      inline def setNearest(value: nearest): Self = StObject.set(x, "Nearest", value.asInstanceOf[js.Any])
      
      inline def setNone(value: none): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
      
      inline def setUp(value: up): Self = StObject.set(x, "Up", value.asInstanceOf[js.Any])
    }
  }
}
