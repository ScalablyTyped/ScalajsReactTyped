package typingsJapgolly.mangopay2NodejsSdk.mod

import typingsJapgolly.mangopay2NodejsSdk.mod.models.Model
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependsObject extends js.Object {
  var dependsPropertyName: String
  var propertyName: String
  var propertyValueMapping: Record[String, Model[_]]
}

object DependsObject {
  @scala.inline
  def apply(dependsPropertyName: String, propertyName: String, propertyValueMapping: Record[String, Model[_]]): DependsObject = {
    val __obj = js.Dynamic.literal(dependsPropertyName = dependsPropertyName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], propertyValueMapping = propertyValueMapping.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DependsObject]
  }
}

