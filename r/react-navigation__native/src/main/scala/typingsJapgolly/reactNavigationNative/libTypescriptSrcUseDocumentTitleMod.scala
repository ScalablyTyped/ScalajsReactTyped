package typingsJapgolly.reactNavigationNative

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerRef
import typingsJapgolly.reactNavigationNative.libTypescriptSrcTypesMod.DocumentTitleOptions
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseDocumentTitleMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useDocumentTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefHandle[NavigationContainerRef[ParamListBase]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(ref: RefHandle[NavigationContainerRef[ParamListBase]], hasEnabledFormatter: DocumentTitleOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], hasEnabledFormatter.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
