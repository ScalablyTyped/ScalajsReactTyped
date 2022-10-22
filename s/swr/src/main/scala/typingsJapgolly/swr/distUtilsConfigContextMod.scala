package typingsJapgolly.swr

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.swr.anon.PartialFullConfiguration
import typingsJapgolly.swr.anon.PropsWithChildrenvalueSWR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsConfigContextMod extends Shortcut {
  
  @JSImport("swr/dist/utils/config-context", JSImport.Default)
  @js.native
  val default: FC[PropsWithChildrenvalueSWR] = js.native
  
  @JSImport("swr/dist/utils/config-context", "SWRConfigContext")
  @js.native
  val SWRConfigContext: Context[PartialFullConfiguration] = js.native
  
  type _To = FC[PropsWithChildrenvalueSWR]
  
  /* This means you don't have to write `default`, but can instead just say `distUtilsConfigContextMod.foo` */
  override def _to: FC[PropsWithChildrenvalueSWR] = default
}
