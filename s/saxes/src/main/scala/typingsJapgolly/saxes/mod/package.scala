package typingsJapgolly.saxes.mod

import typingsJapgolly.saxes.anon.Body
import typingsJapgolly.saxes.mod.^
import typingsJapgolly.saxes.saxesStrings.attribute
import typingsJapgolly.saxes.saxesStrings.cdata
import typingsJapgolly.saxes.saxesStrings.closetag
import typingsJapgolly.saxes.saxesStrings.comment
import typingsJapgolly.saxes.saxesStrings.doctype
import typingsJapgolly.saxes.saxesStrings.end
import typingsJapgolly.saxes.saxesStrings.error
import typingsJapgolly.saxes.saxesStrings.opentag
import typingsJapgolly.saxes.saxesStrings.opentagstart
import typingsJapgolly.saxes.saxesStrings.processinginstruction
import typingsJapgolly.saxes.saxesStrings.ready
import typingsJapgolly.saxes.saxesStrings.text
import typingsJapgolly.saxes.saxesStrings.xmldecl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EVENTS: js.Tuple13[
xmldecl, 
text, 
processinginstruction, 
doctype, 
comment, 
opentagstart, 
attribute, 
opentag, 
closetag, 
cdata, 
error, 
end, 
ready] = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENTS").asInstanceOf[js.Tuple13[
xmldecl, 
text, 
processinginstruction, 
doctype, 
comment, 
opentagstart, 
attribute, 
opentag, 
closetag, 
cdata, 
error, 
end, 
ready]]

type AttributeHandler[O] = js.Function1[/* attribute */ AttributeEventForOptions[O], Unit]

type CDataHandler = js.Function1[/* cdata */ String, Unit]

type CloseTagHandler[O] = js.Function1[/* tag */ TagForOptions[O], Unit]

type CommentHandler = js.Function1[/* comment */ String, Unit]

type DoctypeHandler = js.Function1[/* doctype */ String, Unit]

type EndHandler = js.Function0[Unit]

type ErrorHandler = js.Function1[/* err */ js.Error, Unit]

type EventNameToHandler[O, N /* <: EventName */] = /* import warning: importer.ImportType#apply Failed type conversion: saxes.anon.Attribute<O>[N] */ js.Any

type OpenTagHandler[O] = js.Function1[/* tag */ TagForOptions[O], Unit]

type OpenTagStartHandler[O] = js.Function1[/* tag */ StartTagForOptions[O], Unit]

type PIHandler = js.Function1[/* data */ Body, Unit]

type ReadyHandler = js.Function0[Unit]

type ResolvePrefix = js.Function1[/* prefix */ String, js.UndefOr[String]]

type TextHandler = js.Function1[/* text */ String, Unit]

type XMLDeclHandler = js.Function1[/* decl */ XMLDecl, Unit]
