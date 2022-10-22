package typingsJapgolly.formatjsIntl

import typingsJapgolly.formatjsIntl.libSrcTypesMod.IntlCache
import typingsJapgolly.formatjsIntl.libSrcTypesMod.IntlConfig
import typingsJapgolly.formatjsIntl.libSrcTypesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcCreateIntlMod {
  
  @JSImport("@formatjs/intl/lib/src/create-intl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIntl[T](config: IntlConfig[T]): IntlShape[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(config.asInstanceOf[js.Any]).asInstanceOf[IntlShape[T]]
  inline def createIntl[T](config: IntlConfig[T], cache: IntlCache): IntlShape[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createIntl")(config.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[IntlShape[T]]
  
  type CreateIntlFn[T, C /* <: IntlConfig[T] */, S /* <: IntlShape[T] */] = js.Function2[/* config */ C, /* cache */ js.UndefOr[IntlCache], S]
}
