package typingsJapgolly.breeze.global.breeze

import typingsJapgolly.breeze.breeze.ValidationOptionsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.ValidationOptions")
@js.native
open class ValidationOptions ()
  extends StObject
     with typingsJapgolly.breeze.breeze.ValidationOptions {
  def this(config: ValidationOptionsConfiguration) = this()
  
  /* CompleteClass */
  override def setAsDefault(): typingsJapgolly.breeze.breeze.ValidationOptions = js.native
  
  /* CompleteClass */
  override def `using`(config: ValidationOptionsConfiguration): typingsJapgolly.breeze.breeze.ValidationOptions = js.native
  
  /* CompleteClass */
  var validateOnAttach: Boolean = js.native
  
  /* CompleteClass */
  var validateOnPropertyChange: Boolean = js.native
  
  /* CompleteClass */
  var validateOnQuery: Boolean = js.native
  
  /* CompleteClass */
  var validateOnSave: Boolean = js.native
}
/* static members */
object ValidationOptions {
  
  @JSGlobal("breeze.ValidationOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("breeze.ValidationOptions.defaultInstance")
  @js.native
  def defaultInstance: typingsJapgolly.breeze.breeze.ValidationOptions = js.native
  inline def defaultInstance_=(x: typingsJapgolly.breeze.breeze.ValidationOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
}
