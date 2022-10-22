package typingsJapgolly.jsreportCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsreportCore.jsreportCoreStrings.content
import typingsJapgolly.jsreportCore.jsreportCoreStrings.html
import typingsJapgolly.jsreportCore.jsreportCoreStrings.memory
import typingsJapgolly.jsreportCore.jsreportCoreStrings.none
import typingsJapgolly.jsreportCore.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): Reporter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Reporter]
inline def apply(config: Unit, defaults: Defaults): Reporter = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Reporter]
inline def apply(config: Configuration): Reporter = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Reporter]
inline def apply(config: Configuration, defaults: Defaults): Reporter = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Reporter]

type Engine = none

type Extension = js.Function2[/* reporter */ Reporter, /* definition */ js.Object, Unit]

type Helpers = String | (StringDictionary[js.Function1[/* repeated */ Any, Any]])

type Recipe = html

type ReporterOptionsStoreProvider = memory

/* Inlined jsreport-core.jsreport-core.TemplateRegistry[keyof jsreport-core.jsreport-core.TemplateRegistry] */
type TemplateLike = content
