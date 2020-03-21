package typingsJapgolly.jupyterlabCoreutils.mod

import typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.GraveaccentGraveaccentGraveaccent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "MarkdownCodeBlocks")
@js.native
object MarkdownCodeBlocks extends js.Object {
  @js.native
  class MarkdownCodeBlock protected ()
    extends typingsJapgolly.jupyterlabCoreutils.markdowncodeblocksMod.MarkdownCodeBlocks.MarkdownCodeBlock {
    def this(startLine: Double) = this()
  }
  
  val CODE_BLOCK_MARKER: GraveaccentGraveaccentGraveaccent = js.native
  /**
    * Construct all code snippets from current text
    * (this could be potentially optimized if we can cache and detect differences)
    * @param text - A string to parse codeblocks from
    *
    * @returns An array of MarkdownCodeBlocks.
    */
  def findMarkdownCodeBlocks(text: String): js.Array[
    typingsJapgolly.jupyterlabCoreutils.markdowncodeblocksMod.MarkdownCodeBlocks.MarkdownCodeBlock
  ] = js.native
  /**
    * Check whether the given file extension is a markdown extension
    * @param extension - A file extension
    *
    * @returns true/false depending on whether this is a supported markdown extension
    */
  def isMarkdown(extension: String): Boolean = js.native
}

