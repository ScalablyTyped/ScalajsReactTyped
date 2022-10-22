package typingsJapgolly.smartFoxServer.SFS2X.Entities

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Data
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Data.html
object Data {
  
  trait Vec3D extends StObject {
    
    /**
      * Indicates whether the position is expressed using floating point values or not.
      * @return {boolean} Returns: true if the position is expressed using floating point values.
      */
    def isFloat(): Boolean
    
    /** @type {number} Returns the position along the X axis. */
    var px: Double
    
    /** @type {number} Returns the position along the Y axis. */
    var py: Double
    
    /** @type {number} Returns the position along the Z axis. */
    var pz: Double
  }
  object Vec3D {
    
    inline def apply(isFloat: CallbackTo[Boolean], px: Double, py: Double, pz: Double): Vec3D = {
      val __obj = js.Dynamic.literal(isFloat = isFloat.toJsFn, px = px.asInstanceOf[js.Any], py = py.asInstanceOf[js.Any], pz = pz.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vec3D]
    }
    
    extension [Self <: Vec3D](x: Self) {
      
      inline def setIsFloat(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFloat", value.toJsFn)
      
      inline def setPx(value: Double): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPy(value: Double): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setPz(value: Double): Self = StObject.set(x, "pz", value.asInstanceOf[js.Any])
    }
  }
}
