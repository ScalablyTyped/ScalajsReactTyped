package typingsJapgolly.angularCore.mod

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.angularCore.AnonRead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentChildDecorator
  extends Instantiable2[
      (/* selector */ js.Function) | (/* selector */ String) | (/* selector */ Type[js.Any]), 
      /* opts */ AnonRead, 
      ContentChild
    ] {
  def apply(selector: String, opts: AnonRead): js.Any = js.native
  def apply(selector: js.Function, opts: AnonRead): js.Any = js.native
  /**
    * Parameter decorator that configures a content query.
    *
    * Use to get the first element or the directive matching the selector from the content DOM.
    * If the content DOM changes, and a new child matches the selector,
    * the property will be updated.
    *
    * Content queries are set before the `ngAfterContentInit` callback is called.
    *
    * Does not retrieve elements or directives that are in other components' templates,
    * since a component's template is always a black box to its ancestors.
    *
    * **Metadata Properties**:
    *
    * * **selector** - The directive type or the name used for querying.
    * * **read** - True to read a different token from the queried element.
    * * **static** - True to resolve query results before change detection runs,
    * false to resolve after change detection.
    *
    * When `static` is not provided, uses the query results to determine the timing of query
    * resolution. If any query results are inside a nested view (such as `*ngIf`), the query is
    * resolved after change detection runs. Otherwise, it is resolved before change detection
    * runs.
    *
    * @usageNotes
    *
    * {@example core/di/ts/contentChild/content_child_howto.ts region='HowTo'}
    *
    * ### Example
    *
    * {@example core/di/ts/contentChild/content_child_example.ts region='Component'}
    *
    * @Annotation
    */
  def apply(selector: Type[_], opts: AnonRead): js.Any = js.native
}

