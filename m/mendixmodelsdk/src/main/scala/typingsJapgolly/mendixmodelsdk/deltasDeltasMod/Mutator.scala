package typingsJapgolly.mendixmodelsdk.deltasDeltasMod

import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.ADD
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.CHANGE
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mendixmodelsdk.deltasDeltasMod.IChangeMutator
  - typingsJapgolly.mendixmodelsdk.deltasDeltasMod.IAddMutator
  - typingsJapgolly.mendixmodelsdk.deltasDeltasMod.IRemoveMutator
*/
trait Mutator extends js.Object

object Mutator {
  @scala.inline
  def IChangeMutator(mutatorType: CHANGE, updateIndex: Int | Double = null, value: PrimitiveValue = null): Mutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any])
    if (updateIndex != null) __obj.updateDynamic("updateIndex")(updateIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mutator]
  }
  @scala.inline
  def IAddMutator(mutatorType: ADD, value: PrimitiveValue, insertionIndex: Int | Double = null): Mutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (insertionIndex != null) __obj.updateDynamic("insertionIndex")(insertionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mutator]
  }
  @scala.inline
  def IRemoveMutator(mutatorType: REMOVE, removalIndex: Double): Mutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], removalIndex = removalIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Mutator]
  }
}

