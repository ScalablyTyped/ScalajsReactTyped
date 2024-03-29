package typingsJapgolly.geodesy

import typingsJapgolly.geodesy.dmsMod.Precision
import typingsJapgolly.geodesy.geodesyInts.`10`
import typingsJapgolly.geodesy.geodesyInts.`2`
import typingsJapgolly.geodesy.geodesyInts.`4`
import typingsJapgolly.geodesy.geodesyInts.`6`
import typingsJapgolly.geodesy.geodesyInts.`8`
import typingsJapgolly.geodesy.mod.Datum
import typingsJapgolly.geodesy.mod.Dp
import typingsJapgolly.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mgrsMod {
  
  @JSImport("geodesy/mgrs", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Mgrs {
    def this(zone: Double, band: String, e100k: String, n100k: String, easting: Double, northing: Double) = this()
    def this(
      zone: Double,
      band: String,
      e100k: String,
      n100k: String,
      easting: Double,
      northing: Double,
      datum: Datum
    ) = this()
  }
  object default {
    
    @JSImport("geodesy/mgrs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def parse(mgrsGridRef: String): Mgrs = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mgrsGridRef.asInstanceOf[js.Any]).asInstanceOf[Mgrs]
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/mgrs", "Dms")
  @js.native
  open class Dms ()
    extends typingsJapgolly.geodesy.utmMod.Dms
  object Dms {
    
    @JSImport("geodesy/mgrs", "Dms")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def compassPoint(bearing: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compassPoint")(bearing.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def compassPoint(bearing: Double, precision: Precision): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compassPoint")(bearing.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def fromLocale(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLocale")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def parse(dms: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dms.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def parse(dms: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dms.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def toBrng(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toBrng(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toBrng(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toBrng(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBrng")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def toDms(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toDms(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toDms(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toDms(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDms")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def toLat(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toLat(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLat(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLat(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLat")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def toLocale(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocale")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def toLon(deg: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toLon(deg: Double, format: Unit, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLon(deg: Double, format: Format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toLon(deg: Double, format: Format, dp: Dp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLon")(deg.asInstanceOf[js.Any], format.asInstanceOf[js.Any], dp.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def wrap360(degrees: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap360")(degrees.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def wrap90(degrees: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap90")(degrees.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("geodesy/mgrs", "LatLon")
  @js.native
  open class LatLon () extends LatlonUtmMgrs
  
  @JSImport("geodesy/mgrs", "Utm")
  @js.native
  open class Utm () extends UtmMgrs
  
  @js.native
  trait LatlonUtmMgrs
    extends typingsJapgolly.geodesy.utmMod.LatLon
  
  @js.native
  trait Mgrs extends StObject {
    
    var band: String = js.native
    
    var datum: Datum = js.native
    
    var e100k: String = js.native
    
    var easting: Double = js.native
    
    var n100k: String = js.native
    
    var northing: Double = js.native
    
    def toString(digits: `2` | `4` | `6` | `8` | `10`): String = js.native
    
    def toUtm(): UtmMgrs = js.native
    
    var zone: Double = js.native
  }
  
  @js.native
  trait UtmMgrs
    extends typingsJapgolly.geodesy.utmMod.default {
    
    def toMgrs(): Mgrs = js.native
  }
}
