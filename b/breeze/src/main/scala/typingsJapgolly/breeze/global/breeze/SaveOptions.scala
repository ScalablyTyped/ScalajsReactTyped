package typingsJapgolly.breeze.global.breeze

import typingsJapgolly.breeze.anon.AllowConcurrentSaves
import typingsJapgolly.breeze.breeze.SaveOptionsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.SaveOptions")
@js.native
open class SaveOptions ()
  extends StObject
     with typingsJapgolly.breeze.breeze.SaveOptions {
  def this(config: AllowConcurrentSaves) = this()
  
  /* CompleteClass */
  var allowConcurrentSaves: Boolean = js.native
  
  /* CompleteClass */
  var dataService: typingsJapgolly.breeze.breeze.DataService = js.native
  
  /* CompleteClass */
  var resourceName: String = js.native
  
  /* CompleteClass */
  override def setAsDefault(): typingsJapgolly.breeze.breeze.SaveOptions = js.native
  
  /* CompleteClass */
  var tag: js.Object = js.native
  
  /* CompleteClass */
  override def `using`(config: SaveOptionsConfiguration): typingsJapgolly.breeze.breeze.SaveOptions = js.native
}
/* static members */
object SaveOptions {
  
  @JSGlobal("breeze.SaveOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("breeze.SaveOptions.defaultInstance")
  @js.native
  def defaultInstance: typingsJapgolly.breeze.breeze.SaveOptions = js.native
  inline def defaultInstance_=(x: typingsJapgolly.breeze.breeze.SaveOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
}
