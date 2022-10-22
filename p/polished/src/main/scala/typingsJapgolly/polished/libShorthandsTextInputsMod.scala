package typingsJapgolly.polished

import typingsJapgolly.polished.libTypesInteractionStateMod.InteractionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShorthandsTextInputsMod {
  
  @JSImport("polished/lib/shorthands/textInputs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(states: InteractionState*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(states.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
}
