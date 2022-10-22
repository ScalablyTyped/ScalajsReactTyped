package typingsJapgolly.fabric.mod.fabric

import typingsJapgolly.fabric.fabricImplMod.IObjectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.ActiveSelection")
@js.native
/**
  * Constructor
  * @param objects ActiveSelection objects
  * @param [options] Options object
  */
open class ActiveSelection ()
  extends typingsJapgolly.fabric.fabricImplMod.ActiveSelection {
  def this(objects: js.Array[typingsJapgolly.fabric.fabricImplMod.Object]) = this()
  def this(objects: js.Array[typingsJapgolly.fabric.fabricImplMod.Object], options: IObjectOptions) = this()
  def this(objects: Unit, options: IObjectOptions) = this()
}
/* static members */
object ActiveSelection {
  
  @JSImport("fabric", "fabric.ActiveSelection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns {@link fabric.ActiveSelection} instance from an object representation
    * @memberOf fabric.ActiveSelection
    * @param object Object to create a group from
    * @param [callback] Callback to invoke when an ActiveSelection instance is created
    */
  inline def fromObject(`object`: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
