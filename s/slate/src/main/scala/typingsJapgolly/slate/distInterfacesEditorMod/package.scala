package typingsJapgolly.slate.distInterfacesEditorMod

import typingsJapgolly.slate.distInterfacesCustomTypesMod.ExtendedType
import typingsJapgolly.slate.distInterfacesEditorMod.^
import typingsJapgolly.slate.distInterfacesNodeMod.Node
import typingsJapgolly.slate.distInterfacesPathMod.Path
import typingsJapgolly.slate.distInterfacesRangeMod.Range
import typingsJapgolly.slate.distInterfacesTextMod.Text
import typingsJapgolly.slate.slateStrings.text_
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Editor: EditorInterface = ^.asInstanceOf[js.Dynamic].selectDynamic("Editor").asInstanceOf[EditorInterface]
type Editor = ExtendedType[typingsJapgolly.slate.slateStrings.Editor, BaseEditor]

type BaseSelection = Range | Null

type EditorMarks = Omit[Text, text_]

type NodeMatch[T /* <: Node */] = js.Function2[/* node */ Node, /* path */ Path, /* is T */ Boolean]

type PropsCompare = js.Function2[/* prop */ Partial[Node], /* node */ Partial[Node], Boolean]

type PropsMerge = js.Function2[/* prop */ Partial[Node], /* node */ Partial[Node], js.Object]

type Selection = ExtendedType[typingsJapgolly.slate.slateStrings.Selection, BaseSelection]
