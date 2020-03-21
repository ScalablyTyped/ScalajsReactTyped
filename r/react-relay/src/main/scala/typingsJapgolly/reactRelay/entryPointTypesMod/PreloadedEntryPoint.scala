package typingsJapgolly.reactRelay.entryPointTypesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsJapgolly.reactRelay.reactRelayStrings.entryPoints
import typingsJapgolly.reactRelay.reactRelayStrings.extraProps
import typingsJapgolly.reactRelay.reactRelayStrings.queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoints  :react.react._Global_.JSX.LibraryManagedAttributes<TEntryPointComponent, 'entryPoints'>,   extraProps  :react.react._Global_.JSX.LibraryManagedAttributes<TEntryPointComponent, 'extraProps'>, getComponent (): TEntryPointComponent,   queries  :react.react._Global_.JSX.LibraryManagedAttributes<TEntryPointComponent, 'queries'>}> */
trait PreloadedEntryPoint[TEntryPointComponent] extends js.Object {
  val entryPoints: LibraryManagedAttributes[TEntryPointComponent, typingsJapgolly.reactRelay.reactRelayStrings.entryPoints]
  val extraProps: LibraryManagedAttributes[TEntryPointComponent, typingsJapgolly.reactRelay.reactRelayStrings.extraProps]
  val getComponent: js.Function0[TEntryPointComponent]
  val queries: LibraryManagedAttributes[TEntryPointComponent, typingsJapgolly.reactRelay.reactRelayStrings.queries]
}

object PreloadedEntryPoint {
  @scala.inline
  def apply[TEntryPointComponent](
    entryPoints: LibraryManagedAttributes[TEntryPointComponent, entryPoints],
    extraProps: LibraryManagedAttributes[TEntryPointComponent, extraProps],
    getComponent: CallbackTo[TEntryPointComponent],
    queries: LibraryManagedAttributes[TEntryPointComponent, queries]
  ): PreloadedEntryPoint[TEntryPointComponent] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
    __obj.updateDynamic("getComponent")(getComponent.toJsFn)
    __obj.asInstanceOf[PreloadedEntryPoint[TEntryPointComponent]]
  }
}

