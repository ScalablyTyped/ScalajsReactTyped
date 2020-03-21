package typingsJapgolly.draftJs.mod.Draft.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Base {
  type DraftBlockRenderMap = typingsJapgolly.immutable.Immutable.Map[
    typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftBlockType, 
    typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.DraftBlockRenderConfig
  ]
  type DraftStyleMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.react.mod.CSSProperties]
  type EditorCommand = typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftEditorCommand | java.lang.String
}
