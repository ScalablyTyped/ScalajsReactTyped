package typingsJapgolly.kbar

import typingsJapgolly.kbar.libTypesMod.IKBarContext
import typingsJapgolly.kbar.libTypesMod.KBarProviderProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKbarcontextproviderMod {
  
  @JSImport("kbar/lib/KBarContextProvider", "KBarContext")
  @js.native
  val KBarContext: Context[IKBarContext] = js.native
  
  @JSImport("kbar/lib/KBarContextProvider", "KBarProvider")
  @js.native
  val KBarProvider: FC[PropsWithChildren[KBarProviderProps]] = js.native
}
