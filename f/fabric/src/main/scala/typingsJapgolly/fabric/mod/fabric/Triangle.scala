package typingsJapgolly.fabric.mod.fabric

import typingsJapgolly.fabric.fabricImplMod.ITriangleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Triangle")
@js.native
/**
  * Constructor
  * @param [options] Options object
  */
open class Triangle ()
  extends typingsJapgolly.fabric.fabricImplMod.Triangle {
  def this(options: ITriangleOptions) = this()
}
/* static members */
object Triangle {
  
  @JSImport("fabric", "fabric.Triangle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns Triangle instance from an object representation
    * @param object Object to create an instance from
    */
  inline def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Triangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Triangle]
}
