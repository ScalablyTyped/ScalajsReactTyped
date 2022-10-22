package typingsJapgolly.aceBuilds.mod

import org.scalajs.dom.Element
import typingsJapgolly.aceBuilds.anon.PartialEditorOptions
import typingsJapgolly.aceBuilds.mod.Ace.Config
import typingsJapgolly.aceBuilds.mod.Ace.Document
import typingsJapgolly.aceBuilds.mod.Ace.Editor
import typingsJapgolly.aceBuilds.mod.Ace.SyntaxMode
import typingsJapgolly.aceBuilds.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def config: Config = ^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[Config]

inline def createEditSession(text: String, mode: SyntaxMode): typingsJapgolly.aceBuilds.mod.Ace.EditSession = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditSession")(text.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.aceBuilds.mod.Ace.EditSession]
inline def createEditSession(text: Document, mode: SyntaxMode): typingsJapgolly.aceBuilds.mod.Ace.EditSession = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditSession")(text.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.aceBuilds.mod.Ace.EditSession]

inline def edit(el: String): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any]).asInstanceOf[Editor]
inline def edit(el: String, options: PartialEditorOptions): Editor = (^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Editor]
inline def edit(el: Element): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any]).asInstanceOf[Editor]
inline def edit(el: Element, options: PartialEditorOptions): Editor = (^.asInstanceOf[js.Dynamic].applyDynamic("edit")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Editor]

inline def require(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(name.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
