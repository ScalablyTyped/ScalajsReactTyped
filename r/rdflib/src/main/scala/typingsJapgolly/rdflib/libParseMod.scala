package typingsJapgolly.rdflib

import typingsJapgolly.rdflib.libFormulaMod.default
import typingsJapgolly.rdflib.libTypesMod.ContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParseMod {
  
  @JSImport("rdflib/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: String, kb: typingsJapgolly.rdflib.libFormulaMod.default, base: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(str: String, kb: typingsJapgolly.rdflib.libFormulaMod.default, base: String, contentType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    str: String,
    kb: typingsJapgolly.rdflib.libFormulaMod.default,
    base: String,
    contentType: String,
    callback: CallbackFunc
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    str: String,
    kb: typingsJapgolly.rdflib.libFormulaMod.default,
    base: String,
    contentType: Unit,
    callback: CallbackFunc
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    str: String,
    kb: typingsJapgolly.rdflib.libFormulaMod.default,
    base: String,
    contentType: ContentType
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    str: String,
    kb: typingsJapgolly.rdflib.libFormulaMod.default,
    base: String,
    contentType: ContentType,
    callback: CallbackFunc
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type CallbackFunc = js.Function2[/* error */ Any, /* kb */ default | Null, Unit]
}
