package typingsJapgolly.mockFs.filesystemMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryItems
  extends /* name */ StringDictionary[
      String | Buffer | (js.Function0[
        typingsJapgolly.mockFs.fileMod.^  | typingsJapgolly.mockFs.directoryMod.^  | typingsJapgolly.mockFs.symlinkMod.^ 
      ]) | DirectoryItems
    ]

object DirectoryItems {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[
      String | Buffer | (js.Function0[
        typingsJapgolly.mockFs.fileMod.^  | typingsJapgolly.mockFs.directoryMod.^  | typingsJapgolly.mockFs.symlinkMod.^ 
      ]) | DirectoryItems
    ] = null
  ): DirectoryItems = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DirectoryItems]
  }
}

