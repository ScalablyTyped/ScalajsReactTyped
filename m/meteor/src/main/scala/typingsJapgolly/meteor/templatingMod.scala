package typingsJapgolly.meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/templating", JSImport.Namespace)
@js.native
object templatingMod extends js.Object {
  @js.native
  class Template ()
    extends typingsJapgolly.meteor.Blaze.Template {
    def this(viewName: String) = this()
    def this(viewName: String, renderFunction: js.Function) = this()
  }
  
  @js.native
  trait TemplateStatic
    extends typingsJapgolly.meteor.Blaze.TemplateStatic
       with /* index */ StringDictionary[js.Any | typingsJapgolly.meteor.Blaze.Template] {
    var body: typingsJapgolly.meteor.Blaze.Template = js.native
  }
  
  @js.native
  object Template
    extends TopLevel[typingsJapgolly.meteor.templatingMod.TemplateStatic]
  
}

