package typingsJapgolly.meteorTypings

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.meteorTypings.Blaze.EventsMap
import typingsJapgolly.meteorTypings.Blaze.HelpersMap
import typingsJapgolly.meteorTypings.Blaze.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorTemplatingMod {
  
  @JSImport("meteor/templating", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("meteor/templating", "Template")
  @js.native
  open class Template ()
    extends StObject
       with typingsJapgolly.meteorTypings.Blaze.Template {
    def this(viewName: String) = this()
    def this(viewName: String, renderFunction: js.Function) = this()
    def this(viewName: Unit, renderFunction: js.Function) = this()
    
    /* CompleteClass */
    @JSName("$")
    var $: Any = js.native
    
    /* CompleteClass */
    override def constructView(): View = js.native
    
    /* CompleteClass */
    var created: js.Function = js.native
    
    /* CompleteClass */
    var destroyed: js.Function = js.native
    
    /* CompleteClass */
    override def events(eventsMap: EventsMap): Unit = js.native
    
    /* CompleteClass */
    override def find(selector: String): HTMLElement = js.native
    
    /* CompleteClass */
    override def findAll(selector: String): js.Array[HTMLElement] = js.native
    
    /* CompleteClass */
    var head: typingsJapgolly.meteorTypings.Blaze.Template = js.native
    
    /* CompleteClass */
    override def helpers(helpersMap: HelpersMap): Unit = js.native
    
    /* CompleteClass */
    override def onCreated(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def onDestroyed(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def onRendered(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    var renderFunction: js.Function = js.native
    
    /* CompleteClass */
    var rendered: js.Function = js.native
    
    /* CompleteClass */
    var viewName: String = js.native
  }
  @JSImport("meteor/templating", "Template")
  @js.native
  def Template: typingsJapgolly.meteorTypings.meteorTemplatingMod.TemplateStatic = js.native
  inline def Template_=(x: typingsJapgolly.meteorTypings.meteorTemplatingMod.TemplateStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Template")(x.asInstanceOf[js.Any])
  
  @js.native
  trait TemplateStatic
    extends StObject
       with typingsJapgolly.meteorTypings.Blaze.TemplateStatic
       with /* index */ StringDictionary[Any | typingsJapgolly.meteorTypings.Blaze.Template] {
    
    var body: typingsJapgolly.meteorTypings.Blaze.Template = js.native
  }
}
