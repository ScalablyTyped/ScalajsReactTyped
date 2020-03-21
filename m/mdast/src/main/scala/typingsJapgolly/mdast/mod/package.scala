package typingsJapgolly.mdast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mdast.mdastStrings.left
    - typingsJapgolly.mdast.mdastStrings.right
    - typingsJapgolly.mdast.mdastStrings.center
    - scala.Null
  */
  type AlignType = typingsJapgolly.mdast.mod._AlignType | scala.Null
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mdast.mod.TopLevelContent
    - typingsJapgolly.mdast.mod.ListContent
    - typingsJapgolly.mdast.mod.TableContent
    - typingsJapgolly.mdast.mod.RowContent
    - typingsJapgolly.mdast.mod.PhrasingContent
  */
  type Content = typingsJapgolly.mdast.mod._Content | typingsJapgolly.mdast.mod.ListContent | typingsJapgolly.mdast.mod.TableContent | typingsJapgolly.mdast.mod.RowContent | typingsJapgolly.mdast.mod.FrontmatterContent
  type FrontmatterContent = typingsJapgolly.mdast.mod.YAML
  type ListContent = typingsJapgolly.mdast.mod.ListItem
  type RowContent = typingsJapgolly.mdast.mod.TableCell
  type TableContent = typingsJapgolly.mdast.mod.TableRow
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mdast.mod.BlockContent
    - typingsJapgolly.mdast.mod.FrontmatterContent
    - typingsJapgolly.mdast.mod.DefinitionContent
  */
  type TopLevelContent = typingsJapgolly.mdast.mod._TopLevelContent | typingsJapgolly.mdast.mod.FrontmatterContent
}
