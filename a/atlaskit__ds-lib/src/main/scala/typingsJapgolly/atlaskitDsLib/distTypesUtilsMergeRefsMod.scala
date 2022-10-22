package typingsJapgolly.atlaskitDsLib

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsMergeRefsMod {
  
  @JSImport("@atlaskit/ds-lib/dist/types/utils/merge-refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(refs: js.Array[Refs]): js.Function1[/* value */ HTMLElement | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(refs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ HTMLElement | Null, Unit]]
  
  type Refs = (Ref[HTMLElement | Null]) | (RefHandle[HTMLElement | Null]) | (js.Function1[/* node */ HTMLElement | Null, Unit])
}
