package typingsJapgolly.materializecssMaterialize.mod

import org.scalajs.dom.Element
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@materializecss/materialize", "ComponentBase")
@js.native
open class ComponentBase[TOptions] ()
  extends StObject
     with typingsJapgolly.materializecssMaterialize.M.ComponentBase[TOptions] {
  def this(options: Partial[TOptions]) = this()
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: TOptions = js.native
}
