package typingsJapgolly.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectReference extends js.Object {
  /**
    * A path selector supports easy selection of an object by the parent/child links leading to it from the directory root. Use the link names from each parent/child link to construct the path. Path selectors start with a slash (/) and link names are separated by slashes. For more information about paths, see Access Objects. You can identify an object in one of the following ways:    $ObjectIdentifier - An object identifier is an opaque string provided by Amazon Cloud Directory. When creating objects, the system will provide you with the identifier of the created object. An object’s identifier is immutable and no two objects will ever share the same object identifier    /some/path - Identifies the object based on path    #SomeBatchReference - Identifies the object in a batch call  
    */
  var Selector: js.UndefOr[SelectorObjectReference] = js.native
}

object ObjectReference {
  @scala.inline
  def apply(Selector: SelectorObjectReference = null): ObjectReference = {
    val __obj = js.Dynamic.literal()
    if (Selector != null) __obj.updateDynamic("Selector")(Selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectReference]
  }
}

