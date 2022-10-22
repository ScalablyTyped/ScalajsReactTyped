package typingsJapgolly.ionicAngular

import org.scalajs.dom.Document
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.ionicAngular.providersConfigMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appInitializeMod {
  
  @JSImport("@ionic/angular/app-initialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appInitialize(config: Config, doc: Document, zone: NgZone): js.Function0[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("appInitialize")(config.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Any]]
}
