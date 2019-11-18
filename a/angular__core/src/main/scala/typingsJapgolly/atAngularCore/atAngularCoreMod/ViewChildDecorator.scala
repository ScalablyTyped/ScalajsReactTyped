package typingsJapgolly.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.atAngularCore.Anon_Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewChildDecorator
  extends Instantiable2[
      (/* selector */ js.Function) | (/* selector */ String) | (/* selector */ Type[js.Any]), 
      /* opts */ Anon_Read, 
      ViewChild
    ] {
  def apply(selector: String, opts: Anon_Read): js.Any = js.native
  def apply(selector: js.Function, opts: Anon_Read): js.Any = js.native
  /**
    * @description
    * Property decorator that configures a view query.
    * The change detector looks for the first element or the directive matching the selector
    * in the view DOM. If the view DOM changes, and a new child matches the selector,
    * the property is updated.
    *
    * View queries are set before the `ngAfterViewInit` callback is called.
    *
    * **Metadata Properties**:
    *
    * * **selector** - The directive type or the name used for querying.
    * * **read** - True to read a different token from the queried elements.
    * * **static** - True to resolve query results before change detection runs
    *
    * When `static` is not provided, uses query results to determine the timing of query
    * resolution. If any query results are inside a nested view (such as `*ngIf`), the query is
    * resolved after change detection runs. Otherwise, it is resolved before change detection
    * runs.
    *
    * The following selectors are supported.
    *   * Any class with the `@Component` or `@Directive` decorator
    *   * A template reference variable as a string (e.g. query `<my-component #cmp></my-component>`
    * with `@ViewChild('cmp')`)
    *   * Any provider defined in the child component tree of the current component (e.g.
    * `@ViewChild(SomeService) someService: SomeService`)
    *   * Any provider defined through a string token (e.g. `@ViewChild('someToken') someTokenVal:
    * any`)
    *   * A `TemplateRef` (e.g. query `<ng-template></ng-template>` with `@ViewChild(TemplateRef)
    * template;`)
    *
    * @usageNotes
    *
    * {@example core/di/ts/viewChild/view_child_example.ts region='Component'}
    *
    * ### Example 2
    *
    * {@example core/di/ts/viewChild/view_child_howto.ts region='HowTo'}
    *
    * @Annotation
    */
  def apply(selector: Type[_], opts: Anon_Read): js.Any = js.native
}

