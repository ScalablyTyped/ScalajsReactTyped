package typingsJapgolly.reactAce

import typingsJapgolly.reactAce.aceMod.IAceEditorProps
import typingsJapgolly.reactAce.diffMod.IDiffEditorProps
import typingsJapgolly.reactAce.splitMod.ISplitEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ace", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.reactAce.aceMod.default {
    def this(props: IAceEditorProps) = this()
  }
  
  @js.native
  class diff protected ()
    extends typingsJapgolly.reactAce.diffMod.default {
    def this(props: IDiffEditorProps) = this()
  }
  
  @js.native
  class split protected ()
    extends typingsJapgolly.reactAce.splitMod.default {
    def this(props: ISplitEditorProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: PartialIAceEditorProps = js.native
    var propTypes: ValidationMapIAceEditorPr = js.native
  }
  
  /* static members */
  @js.native
  object diff extends js.Object {
    var defaultProps: PartialIDiffEditorProps = js.native
    var propTypes: ValidationMapIDiffEditorP = js.native
  }
  
  /* static members */
  @js.native
  object split extends js.Object {
    var defaultProps: PartialISplitEditorProps = js.native
    var propTypes: ValidationMapISplitEditor = js.native
  }
  
}

