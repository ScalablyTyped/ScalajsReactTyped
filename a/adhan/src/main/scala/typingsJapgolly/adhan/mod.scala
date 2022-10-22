package typingsJapgolly.adhan

import typingsJapgolly.adhan.adhanStrings.Dubai
import typingsJapgolly.adhan.adhanStrings.Egyptian
import typingsJapgolly.adhan.adhanStrings.Karachi
import typingsJapgolly.adhan.adhanStrings.Kuwait
import typingsJapgolly.adhan.adhanStrings.MoonsightingCommittee
import typingsJapgolly.adhan.adhanStrings.MuslimWorldLeague
import typingsJapgolly.adhan.adhanStrings.NorthAmerica
import typingsJapgolly.adhan.adhanStrings.Other
import typingsJapgolly.adhan.adhanStrings.Qatar
import typingsJapgolly.adhan.adhanStrings.Singapore
import typingsJapgolly.adhan.adhanStrings.Tehran
import typingsJapgolly.adhan.adhanStrings.Turkey
import typingsJapgolly.adhan.adhanStrings.UmmAlQura
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
import typingsJapgolly.adhan.libTypesCalculationParametersMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("adhan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CalculationMethod {
    
    @JSImport("adhan", "CalculationMethod")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Dubai(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Dubai")().asInstanceOf[default]
    
    inline def Egyptian(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Egyptian")().asInstanceOf[default]
    
    inline def Karachi(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Karachi")().asInstanceOf[default]
    
    inline def Kuwait(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Kuwait")().asInstanceOf[default]
    
    inline def MoonsightingCommittee(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("MoonsightingCommittee")().asInstanceOf[default]
    
    inline def MuslimWorldLeague(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("MuslimWorldLeague")().asInstanceOf[default]
    
    inline def NorthAmerica(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("NorthAmerica")().asInstanceOf[default]
    
    inline def Other(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Other")().asInstanceOf[default]
    
    inline def Qatar(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Qatar")().asInstanceOf[default]
    
    inline def Singapore(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Singapore")().asInstanceOf[default]
    
    inline def Tehran(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Tehran")().asInstanceOf[default]
    
    inline def Turkey(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Turkey")().asInstanceOf[default]
    
    inline def UmmAlQura(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("UmmAlQura")().asInstanceOf[default]
  }
  
  @JSImport("adhan", "CalculationParameters")
  @js.native
  open class CalculationParameters () extends default {
    def this(method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double
    ) = this()
    def this(method: Null, fajrAngle: Double) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Double
    ) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Double) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Double,
      ishaInterval: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Unit,
      ishaInterval: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Double,
      ishaInterval: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Unit,
      ishaInterval: Double
    ) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Double, ishaInterval: Double) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Unit, ishaInterval: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Double, ishaInterval: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Unit, ishaInterval: Double) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Double,
      ishaInterval: Double,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Double,
      ishaInterval: Unit,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Unit,
      ishaInterval: Double,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Double,
      ishaAngle: Unit,
      ishaInterval: Unit,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Double,
      ishaInterval: Double,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Double,
      ishaInterval: Unit,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Unit,
      ishaInterval: Double,
      maghribAngle: Double
    ) = this()
    def this(
      method: /* keyof adhan.anon.Dubai */ MuslimWorldLeague | Egyptian | Karachi | UmmAlQura | Dubai | MoonsightingCommittee | NorthAmerica | Kuwait | Qatar | Singapore | Tehran | Turkey | Other,
      fajrAngle: Unit,
      ishaAngle: Unit,
      ishaInterval: Unit,
      maghribAngle: Double
    ) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Double, ishaInterval: Double, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Double, ishaInterval: Unit, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Unit, ishaInterval: Double, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Double, ishaAngle: Unit, ishaInterval: Unit, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Double, ishaInterval: Double, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Double, ishaInterval: Unit, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Unit, ishaInterval: Double, maghribAngle: Double) = this()
    def this(method: Null, fajrAngle: Unit, ishaAngle: Unit, ishaInterval: Unit, maghribAngle: Double) = this()
  }
  
  @JSImport("adhan", "Coordinates")
  @js.native
  open class Coordinates protected ()
    extends typingsJapgolly.adhan.libTypesCoordinatesMod.default {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  object HighLatitudeRule {
    
    @JSImport("adhan", "HighLatitudeRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("adhan", "HighLatitudeRule.MiddleOfTheNight")
    @js.native
    val MiddleOfTheNight: middleofthenight = js.native
    
    @JSImport("adhan", "HighLatitudeRule.SeventhOfTheNight")
    @js.native
    val SeventhOfTheNight: seventhofthenight = js.native
    
    @JSImport("adhan", "HighLatitudeRule.TwilightAngle")
    @js.native
    val TwilightAngle: twilightangle = js.native
    
    inline def recommended(coordinates: typingsJapgolly.adhan.libTypesCoordinatesMod.default): middleofthenight | seventhofthenight = ^.asInstanceOf[js.Dynamic].applyDynamic("recommended")(coordinates.asInstanceOf[js.Any]).asInstanceOf[middleofthenight | seventhofthenight]
  }
  
  object Madhab {
    
    @JSImport("adhan", "Madhab.Hanafi")
    @js.native
    val Hanafi: hanafi = js.native
    
    @JSImport("adhan", "Madhab.Shafi")
    @js.native
    val Shafi: shafi = js.native
  }
  
  object PolarCircleResolution {
    
    @JSImport("adhan", "PolarCircleResolution.AqrabBalad")
    @js.native
    val AqrabBalad: typingsJapgolly.adhan.adhanStrings.AqrabBalad = js.native
    
    @JSImport("adhan", "PolarCircleResolution.AqrabYaum")
    @js.native
    val AqrabYaum: typingsJapgolly.adhan.adhanStrings.AqrabYaum = js.native
    
    @JSImport("adhan", "PolarCircleResolution.Unresolved")
    @js.native
    val Unresolved: typingsJapgolly.adhan.adhanStrings.Unresolved = js.native
  }
  
  object Prayer {
    
    @JSImport("adhan", "Prayer.Asr")
    @js.native
    val Asr: asr = js.native
    
    @JSImport("adhan", "Prayer.Dhuhr")
    @js.native
    val Dhuhr: dhuhr = js.native
    
    @JSImport("adhan", "Prayer.Fajr")
    @js.native
    val Fajr: fajr = js.native
    
    @JSImport("adhan", "Prayer.Isha")
    @js.native
    val Isha: isha = js.native
    
    @JSImport("adhan", "Prayer.Maghrib")
    @js.native
    val Maghrib: maghrib = js.native
    
    @JSImport("adhan", "Prayer.None")
    @js.native
    val None: none = js.native
    
    @JSImport("adhan", "Prayer.Sunrise")
    @js.native
    val Sunrise: sunrise = js.native
  }
  
  @JSImport("adhan", "PrayerTimes")
  @js.native
  open class PrayerTimes protected ()
    extends typingsJapgolly.adhan.libTypesPrayerTimesMod.default {
    def this(
      coordinates: typingsJapgolly.adhan.libTypesCoordinatesMod.default,
      date: js.Date,
      calculationParameters: default
    ) = this()
  }
  
  inline def Qibla(coordinates: typingsJapgolly.adhan.libTypesCoordinatesMod.default): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Qibla")(coordinates.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  object Rounding {
    
    @JSImport("adhan", "Rounding.Nearest")
    @js.native
    val Nearest: nearest = js.native
    
    @JSImport("adhan", "Rounding.None")
    @js.native
    val None: none = js.native
    
    @JSImport("adhan", "Rounding.Up")
    @js.native
    val Up: up = js.native
  }
  
  object Shafaq {
    
    @JSImport("adhan", "Shafaq.Abyad")
    @js.native
    val Abyad: abyad = js.native
    
    @JSImport("adhan", "Shafaq.Ahmer")
    @js.native
    val Ahmer: ahmer = js.native
    
    @JSImport("adhan", "Shafaq.General")
    @js.native
    val General: general = js.native
  }
  
  @JSImport("adhan", "SunnahTimes")
  @js.native
  open class SunnahTimes protected ()
    extends typingsJapgolly.adhan.libTypesSunnahTimesMod.default {
    def this(prayerTimes: typingsJapgolly.adhan.libTypesPrayerTimesMod.default) = this()
  }
}
