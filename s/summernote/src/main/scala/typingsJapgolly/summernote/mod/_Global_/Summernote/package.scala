package typingsJapgolly.summernote.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Summernote {
  type EditImageCallback = js.Function1[/* $image */ typingsJapgolly.jquery.JQuery_.Node, scala.Unit]
  type colorsDef = js.Array[js.Array[js.Array[java.lang.String]]]
  type htmlElement = java.lang.String
  type popoverAirDef = js.Tuple5[
    js.Tuple2[
      typingsJapgolly.summernote.summernoteStrings.color, 
      typingsJapgolly.summernote.mod._Global_.Summernote.popoverAirOptionsColor
    ], 
    js.Tuple2[
      typingsJapgolly.summernote.summernoteStrings.font, 
      typingsJapgolly.summernote.mod._Global_.Summernote.popoverAirOptionsFont
    ], 
    js.Tuple2[
      typingsJapgolly.summernote.summernoteStrings.para, 
      typingsJapgolly.summernote.mod._Global_.Summernote.popoverAirOptionsPara
    ], 
    js.Tuple2[
      typingsJapgolly.summernote.summernoteStrings.table, 
      typingsJapgolly.summernote.mod._Global_.Summernote.popoverAirOptionsTable
    ], 
    js.Tuple2[
      typingsJapgolly.summernote.summernoteStrings.insert, 
      typingsJapgolly.summernote.mod._Global_.Summernote.popoverAirOptionsInsert
    ]
  ]
  type popoverAirOptionsColor = typingsJapgolly.summernote.summernoteStrings.color
  type popoverAirOptionsTable = typingsJapgolly.summernote.summernoteStrings.table
  type popoverImageDef = js.Tuple3[
    js.Tuple2[
      typingsJapgolly.summernote.summernoteStrings.imagesize, 
      js.Array[typingsJapgolly.summernote.mod._Global_.Summernote.popoverImageOptionsImagesize]
    ], 
    js.Tuple2[
      typingsJapgolly.summernote.summernoteStrings.float, 
      js.Array[typingsJapgolly.summernote.mod._Global_.Summernote.popoverImageOptionsFloat]
    ], 
    js.Tuple2[
      typingsJapgolly.summernote.summernoteStrings.remove, 
      js.Array[typingsJapgolly.summernote.mod._Global_.Summernote.popoverImageOptionsRemove]
    ]
  ]
  type popoverImageOptionsRemove = typingsJapgolly.summernote.summernoteStrings.removeMedia
  type popoverLinkDef = js.Array[
    js.Tuple2[
      typingsJapgolly.summernote.summernoteStrings.link, 
      js.Array[typingsJapgolly.summernote.mod._Global_.Summernote.popoverLinkLinkOptions]
    ]
  ]
  type toolbarColorGroupOptions = typingsJapgolly.summernote.summernoteStrings.color
  // type toolbarDef = [string, string[]][]
  type toolbarDef = js.Array[
    js.Tuple2[
      typingsJapgolly.summernote.summernoteStrings.style | typingsJapgolly.summernote.summernoteStrings.font | typingsJapgolly.summernote.summernoteStrings.fontsize_ | typingsJapgolly.summernote.summernoteStrings.color | typingsJapgolly.summernote.summernoteStrings.para | typingsJapgolly.summernote.summernoteStrings.height | typingsJapgolly.summernote.summernoteStrings.table | typingsJapgolly.summernote.summernoteStrings.insert | typingsJapgolly.summernote.summernoteStrings.view | typingsJapgolly.summernote.summernoteStrings.help | typingsJapgolly.summernote.summernoteStrings.misc, 
      js.Array[
        typingsJapgolly.summernote.mod._Global_.Summernote.miscGroupOptions | typingsJapgolly.summernote.mod._Global_.Summernote.toolbarColorGroupOptions | typingsJapgolly.summernote.mod._Global_.Summernote.toolbarFontGroupOptions | typingsJapgolly.summernote.mod._Global_.Summernote.toolbarFontsizeGroupOptions | typingsJapgolly.summernote.mod._Global_.Summernote.toolbarHeightGroupOptions | typingsJapgolly.summernote.mod._Global_.Summernote.toolbarHelpGroupOptions | typingsJapgolly.summernote.mod._Global_.Summernote.toolbarInsertGroupOptions | typingsJapgolly.summernote.mod._Global_.Summernote.toolbarParaGroupOptions | typingsJapgolly.summernote.mod._Global_.Summernote.toolbarStyleGroupOptions | typingsJapgolly.summernote.mod._Global_.Summernote.toolbarTableGroupOptions | typingsJapgolly.summernote.mod._Global_.Summernote.toolbarViewGroupOptions
      ]
    ]
  ]
  type toolbarHeightGroupOptions = typingsJapgolly.summernote.summernoteStrings.height
  type toolbarHelpGroupOptions = typingsJapgolly.summernote.summernoteStrings.help
  type toolbarTableGroupOptions = typingsJapgolly.summernote.summernoteStrings.table
}
