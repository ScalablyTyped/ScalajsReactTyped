package typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typingsJapgolly.immutable.Immutable.List
import typingsJapgolly.immutable.Immutable.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ trait ContentBlock extends js.Object {
  /**
    * Execute a callback for every contiguous range of entities within the block.
    */
  def findEntityRanges(
    filterFn: js.Function1[/* value */ CharacterMetadata, Boolean],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit
  /**
    * Execute a callback for every contiguous range of styles within the block.
    */
  def findStyleRanges(
    filterFn: js.Function1[/* value */ CharacterMetadata, Boolean],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit
  def getCharacterList(): List[CharacterMetadata]
  def getData(): Map[_, _]
  def getDepth(): Double
  def getEntityAt(offset: Double): String
  def getInlineStyleAt(offset: Double): DraftInlineStyle
  def getKey(): String
  def getLength(): Double
  def getText(): String
  def getType(): DraftBlockType
}

object ContentBlock {
  @scala.inline
  def apply(
    findEntityRanges: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Callback,
    findStyleRanges: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Callback,
    getCharacterList: CallbackTo[List[CharacterMetadata]],
    getData: CallbackTo[Map[js.Any, js.Any]],
    getDepth: CallbackTo[Double],
    getEntityAt: Double => CallbackTo[String],
    getInlineStyleAt: Double => CallbackTo[DraftInlineStyle],
    getKey: CallbackTo[String],
    getLength: CallbackTo[Double],
    getText: CallbackTo[String],
    getType: CallbackTo[DraftBlockType]
  ): ContentBlock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findEntityRanges")(js.Any.fromFunction2((t0: js.Function1[
  /* value */ typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, 
  scala.Boolean], t1: js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit]) => findEntityRanges(t0, t1).runNow()))
    __obj.updateDynamic("findStyleRanges")(js.Any.fromFunction2((t0: js.Function1[
  /* value */ typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, 
  scala.Boolean], t1: js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit]) => findStyleRanges(t0, t1).runNow()))
    __obj.updateDynamic("getCharacterList")(getCharacterList.toJsFn)
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("getDepth")(getDepth.toJsFn)
    __obj.updateDynamic("getEntityAt")(js.Any.fromFunction1((t0: scala.Double) => getEntityAt(t0).runNow()))
    __obj.updateDynamic("getInlineStyleAt")(js.Any.fromFunction1((t0: scala.Double) => getInlineStyleAt(t0).runNow()))
    __obj.updateDynamic("getKey")(getKey.toJsFn)
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getText")(getText.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.asInstanceOf[ContentBlock]
  }
}

