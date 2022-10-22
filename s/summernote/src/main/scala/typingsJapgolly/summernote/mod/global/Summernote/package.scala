package typingsJapgolly.summernote.mod.global.Summernote

import typingsJapgolly.jquery.JQuery.Node
import typingsJapgolly.summernote.summernoteStrings.color
import typingsJapgolly.summernote.summernoteStrings.float
import typingsJapgolly.summernote.summernoteStrings.font
import typingsJapgolly.summernote.summernoteStrings.fontname_
import typingsJapgolly.summernote.summernoteStrings.fontsize_
import typingsJapgolly.summernote.summernoteStrings.height
import typingsJapgolly.summernote.summernoteStrings.help
import typingsJapgolly.summernote.summernoteStrings.imagesize
import typingsJapgolly.summernote.summernoteStrings.insert
import typingsJapgolly.summernote.summernoteStrings.link
import typingsJapgolly.summernote.summernoteStrings.misc
import typingsJapgolly.summernote.summernoteStrings.para
import typingsJapgolly.summernote.summernoteStrings.remove
import typingsJapgolly.summernote.summernoteStrings.removeMedia
import typingsJapgolly.summernote.summernoteStrings.style
import typingsJapgolly.summernote.summernoteStrings.table
import typingsJapgolly.summernote.summernoteStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EditImageCallback = js.Function1[/* $image */ Node, Unit]

type colorsDef = js.Array[js.Array[js.Array[String]]]

type htmlElement = String

type popoverAirDef = js.Tuple5[
js.Tuple2[color, popoverAirOptionsColor], 
js.Tuple2[font, popoverAirOptionsFont], 
js.Tuple2[para, popoverAirOptionsPara], 
js.Tuple2[table, popoverAirOptionsTable], 
js.Tuple2[insert, popoverAirOptionsInsert]]

type popoverAirOptionsColor = color

type popoverAirOptionsTable = table

type popoverImageDef = js.Tuple3[
js.Tuple2[imagesize, js.Array[popoverImageOptionsImagesize]], 
js.Tuple2[float, js.Array[popoverImageOptionsFloat]], 
js.Tuple2[remove, js.Array[popoverImageOptionsRemove]]]

type popoverImageOptionsRemove = removeMedia

type popoverLinkDef = js.Array[js.Tuple2[link, js.Array[popoverLinkLinkOptions]]]

type toolbarColorGroupOptions = color

// type toolbarDef = [string, string[]][]
type toolbarDef = js.Array[
js.Tuple2[
  style | font | fontname_ | fontsize_ | color | para | height | table | insert | view | help | misc, 
  js.Array[
    miscGroupOptions | toolbarColorGroupOptions | toolbarFontGroupOptions | toolbarFontNameOptions | toolbarFontsizeGroupOptions | toolbarHeightGroupOptions | toolbarHelpGroupOptions | toolbarInsertGroupOptions | toolbarParaGroupOptions | toolbarStyleGroupOptions | toolbarTableGroupOptions | toolbarViewGroupOptions
  ]
]]

type toolbarFontNameOptions = String

type toolbarHeightGroupOptions = height

type toolbarHelpGroupOptions = help

type toolbarTableGroupOptions = table
