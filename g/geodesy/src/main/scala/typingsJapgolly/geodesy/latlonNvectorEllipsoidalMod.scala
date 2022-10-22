package typingsJapgolly.geodesy

import typingsJapgolly.geodesy.dmsMod.Precision
import typingsJapgolly.geodesy.latlonEllipsoidalMod.Vector3d
import typingsJapgolly.geodesy.mod.Datum
import typingsJapgolly.geodesy.mod.Dp
import typingsJapgolly.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latlonNvectorEllipsoidalMod {
  
  @JSImport("geodesy/latlon-nvector-ellipsoidal", JSImport.Default)
  @js.native
  open class default () extends LatLonNvectorEllipsoidal
  
  @JSImport("geodesy/latlon-nvector-ellipsoidal", "Cartesian")
  @js.native
  open class Cartesian () extends CartesianNvector
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms")
  @js.native
  open class Dms ()
    extends typingsJapgolly.geodesy.latlonEllipsoidalMod.Dms
  object Dms {
    
    @JSImport("geodesy/latlon-nvector-ellipsoidal", "Dms")
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
  
  @JSImport("geodesy/latlon-nvector-ellipsoidal", "Nvector")
  @js.native
  open class Nvector protected () extends NvectorEllipsoidal {
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, h: Double) = this()
    def this(x: Double, y: Double, z: Double, h: Double, datum: Datum) = this()
    def this(x: Double, y: Double, z: Double, h: Unit, datum: Datum) = this()
  }
  
  @js.native
  trait CartesianNvector
    extends typingsJapgolly.geodesy.latlonEllipsoidalMod.Cartesian {
    
    def toNvector(datum: Datum): NvectorEllipsoidal = js.native
  }
  
  @js.native
  trait LatLonNvectorEllipsoidal
    extends typingsJapgolly.geodesy.latlonEllipsoidalMod.default {
    
    def deltaTo(point: LatLonNvectorEllipsoidal): Ned = js.native
    
    def destinationPoint(delta: Ned): LatLonNvectorEllipsoidal = js.native
    
    def toNvector(): NvectorEllipsoidal = js.native
  }
  
  @js.native
  trait Ned extends StObject {
    
    def bearing: Double = js.native
    
    def elevation: Double = js.native
    
    def length: Double = js.native
    
    def toString(dp: Double): String = js.native
  }
  
  @js.native
  trait NvectorEllipsoidal extends Vector3d {
    
    def toCartesian(): CartesianNvector = js.native
    
    def toLatLon(): LatLonNvectorEllipsoidal = js.native
    
    def toString(dp: Double, dpHeight: Double): String = js.native
    def toString(dp: Unit, dpHeight: Double): String = js.native
  }
}
