package typingsJapgolly.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "ext internal"
trait ExtTypeSettings extends js.Object {
  /**
    * Type detection functions for plug-in development.
    *
    * @see https://datatables.net/manual/plug-ins/type-detection
    */
  var detect: js.Array[FunctionExtTypeSettingsDetect]
  /**
    * Type based ordering functions for plug-in development.
    *
    * @see https://datatables.net/manual/plug-ins/sorting
    * @default {}
    */
  var order: js.Object
  /**
    * Type based search formatting for plug-in development.
    *
    * @default {}
    * @example
    *   $.fn.dataTable.ext.type.search['title-numeric'] = function ( d ) {
    *     return d.replace(/\n/g," ").replace( /<.*?>/g, "" );
    *   }
    */
  var search: js.Object
}

object ExtTypeSettings {
  @scala.inline
  def apply(detect: js.Array[FunctionExtTypeSettingsDetect], order: js.Object, search: js.Object): ExtTypeSettings = {
    val __obj = js.Dynamic.literal(detect = detect.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtTypeSettings]
  }
}

