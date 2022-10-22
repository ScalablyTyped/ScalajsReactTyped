package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XLocalizable
import typingsJapgolly.activexLibreoffice.com_.sun.star.ucb.XContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a high level API to organize document templates */
trait TemplateAccess
  extends StObject
     with XDocumentTemplates
     with XLocalizable
object TemplateAccess {
  
  inline def apply(
    Content: XContent,
    Locale: Locale,
    acquire: Callback,
    addGroup: String => Boolean,
    addTemplate: (String, String, String) => Boolean,
    getContent: CallbackTo[XContent],
    getLocale: CallbackTo[Locale],
    queryInterface: `type` => Any,
    release: Callback,
    removeGroup: String => Boolean,
    removeTemplate: (String, String) => Boolean,
    renameGroup: (String, String) => Boolean,
    renameTemplate: (String, String, String) => Boolean,
    setLocale: Locale => Callback,
    storeTemplate: (String, String, XStorable) => Boolean,
    update: Callback
  ): TemplateAccess = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], acquire = acquire.toJsFn, addGroup = js.Any.fromFunction1(addGroup), addTemplate = js.Any.fromFunction3(addTemplate), getContent = getContent.toJsFn, getLocale = getLocale.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeGroup = js.Any.fromFunction1(removeGroup), removeTemplate = js.Any.fromFunction2(removeTemplate), renameGroup = js.Any.fromFunction2(renameGroup), renameTemplate = js.Any.fromFunction3(renameTemplate), setLocale = js.Any.fromFunction1((t0: Locale) => setLocale(t0).runNow()), storeTemplate = js.Any.fromFunction3(storeTemplate), update = update.toJsFn)
    __obj.asInstanceOf[TemplateAccess]
  }
}
