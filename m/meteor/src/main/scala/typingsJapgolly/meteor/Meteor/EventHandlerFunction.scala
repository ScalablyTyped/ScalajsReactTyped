package typingsJapgolly.meteor.Meteor

import typingsJapgolly.meteor.Blaze.TemplateInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandlerFunction
  extends js.Function {
  
  def apply(): Unit = js.native
  def apply(event: Unit, templateInstance: TemplateInstance[Any]): Unit = js.native
  def apply(event: Event): Unit = js.native
  def apply(event: Event, templateInstance: TemplateInstance[Any]): Unit = js.native
}
