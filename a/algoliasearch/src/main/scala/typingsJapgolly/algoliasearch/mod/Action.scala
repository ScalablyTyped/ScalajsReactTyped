package typingsJapgolly.algoliasearch.mod

import typingsJapgolly.algoliasearch.algoliasearchStrings.addObject
import typingsJapgolly.algoliasearch.algoliasearchStrings.clear
import typingsJapgolly.algoliasearch.algoliasearchStrings.delete
import typingsJapgolly.algoliasearch.algoliasearchStrings.deleteObject
import typingsJapgolly.algoliasearch.algoliasearchStrings.partialUpdateObject
import typingsJapgolly.algoliasearch.algoliasearchStrings.partialUpdateObjectNoCreate
import typingsJapgolly.algoliasearch.algoliasearchStrings.updateObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describe the action object used for batch operation
  */
trait Action extends js.Object {
  /**
    * Type of the batch action
    */
  var action: addObject | updateObject | partialUpdateObject | partialUpdateObjectNoCreate | deleteObject | delete | clear
  /**
    * Name of the index where the bact will be performed
    */
  var indexName: String
}

object Action {
  @scala.inline
  def apply(
    action: addObject | updateObject | partialUpdateObject | partialUpdateObjectNoCreate | deleteObject | delete | clear,
    indexName: String
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Action]
  }
}

