package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gives a position relative to some size defined by other means. Values from 0 to 1 cover the entire reference rectangle. Values may also be greater
  * than one, meaning a bigger size than the reference size. Negative values are not allowed.
  */
trait RelativeSize extends StObject {
  
  /**
    * The extension in the primary direction. The direction is defined by the object using this point.
    *
    * Typically, the direction is determined by an Orientation. Another typical use would be the direction of a given orientation-angle.
    *
    * The values are relative to the page or an object. Values between 0 and 1 span the complete bounding rectangle of the page/object.
    *
    * For a western Orientation this is the width.
    */
  var Primary: Double
  
  /**
    * The extension in the secondary direction. The direction is defined by the object using this point.
    *
    * Typically, the direction is determined by an Orientation. Another typical use would be the direction perpendicular to a given orientation-angle.
    *
    * The values are relative to the page or an object. Values between 0 and 1 span the complete bounding rectangle of the page/object.
    *
    * For a western Orientation this is the height.
    */
  var Secondary: Double
}
object RelativeSize {
  
  inline def apply(Primary: Double, Secondary: Double): RelativeSize = {
    val __obj = js.Dynamic.literal(Primary = Primary.asInstanceOf[js.Any], Secondary = Secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeSize]
  }
  
  extension [Self <: RelativeSize](x: Self) {
    
    inline def setPrimary(value: Double): Self = StObject.set(x, "Primary", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: Double): Self = StObject.set(x, "Secondary", value.asInstanceOf[js.Any])
  }
}
