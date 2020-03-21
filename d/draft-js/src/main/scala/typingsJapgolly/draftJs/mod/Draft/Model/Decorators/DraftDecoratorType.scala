package typingsJapgolly.draftJs.mod.Draft.Model.Decorators

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState
import typingsJapgolly.immutable.Immutable.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for document decorator classes, allowing the creation of
  * custom decorator classes.
  *
  * See `CompositeDraftDecorator` for the most common use case.
  */
trait DraftDecoratorType extends js.Object {
  /**
    * Given a decorator key, return the component to use when rendering
    * this decorated range.
    */
  def getComponentForKey(key: String): js.Function
  /**
    * Given a `ContentBlock`, return an immutable List of decorator keys.
    */
  def getDecorations(block: ContentBlock, contentState: ContentState): List[String]
  /**
    * Given a decorator key, optionally return the props to use when rendering
    * this decorated range.
    */
  def getPropsForKey(key: String): js.Any
}

object DraftDecoratorType {
  @scala.inline
  def apply(
    getComponentForKey: String => CallbackTo[js.Function],
    getDecorations: (ContentBlock, ContentState) => CallbackTo[List[String]],
    getPropsForKey: String => CallbackTo[js.Any]
  ): DraftDecoratorType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getComponentForKey")(js.Any.fromFunction1((t0: java.lang.String) => getComponentForKey(t0).runNow()))
    __obj.updateDynamic("getDecorations")(js.Any.fromFunction2((t0: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock, t1: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState) => getDecorations(t0, t1).runNow()))
    __obj.updateDynamic("getPropsForKey")(js.Any.fromFunction1((t0: java.lang.String) => getPropsForKey(t0).runNow()))
    __obj.asInstanceOf[DraftDecoratorType]
  }
}

