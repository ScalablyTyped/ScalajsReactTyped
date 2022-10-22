package typingsJapgolly.antvG2plot

import typingsJapgolly.antvG2plot.anon.Get
import typingsJapgolly.antvG2plot.libTypesLocaleMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreLocaleMod {
  
  @JSImport("@antv/g2plot/lib/core/locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocale(locale: String): Get = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Get]
  
  inline def registerLocale(locale: String, localeObj: Locale): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocale")(locale.asInstanceOf[js.Any], localeObj.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
