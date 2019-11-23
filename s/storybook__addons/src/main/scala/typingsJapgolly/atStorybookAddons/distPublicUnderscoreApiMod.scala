package typingsJapgolly.atStorybookAddons

import typingsJapgolly.atStorybookAddons.distHooksMod.Decorator
import typingsJapgolly.atStorybookAddons.distHooksMod.EventMap
import typingsJapgolly.atStorybookAddons.distMakeDashDecoratorMod.MakeDecoratorOptions
import typingsJapgolly.atStorybookAddons.distMakeDashDecoratorMod.MakeDecoratorResult
import typingsJapgolly.atStorybookAddons.distTypesMod.StoryContext
import typingsJapgolly.atStorybookAddons.distTypesMod.StoryGetter
import typingsJapgolly.atStorybookAddons.distTypesMod.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons/dist/public_api", JSImport.Namespace)
@js.native
object distPublicUnderscoreApiMod extends js.Object {
  @js.native
  class AddonStore ()
    extends typingsJapgolly.atStorybookAddons.distMod.AddonStore
  
  @js.native
  class HooksContext ()
    extends typingsJapgolly.atStorybookAddons.distHooksMod.HooksContext
  
  val addons: typingsJapgolly.atStorybookAddons.distMod.AddonStore = js.native
  val default: typingsJapgolly.atStorybookAddons.distMod.AddonStore = js.native
  def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
  def isSupportedType(`type`: Types): Boolean = js.native
  def makeDecorator(hasNameParameterNameWrapperSkipIfNoParametersOrOptionsAllowDeprecatedUsage: MakeDecoratorOptions): MakeDecoratorResult = js.native
  def mockChannel(): typingsJapgolly.atStorybookChannels.atStorybookChannelsMod.default = js.native
  def useCallback[T](callback: T): T = js.native
  def useCallback[T](callback: T, deps: js.Array[_]): T = js.native
  def useChannel(eventMap: EventMap): js.Any = js.native
  def useChannel(eventMap: EventMap, deps: js.Array[_]): js.Any = js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[_]): Unit = js.native
  def useMemo[T](nextCreate: js.Function0[T]): T = js.native
  def useMemo[T](nextCreate: js.Function0[T], deps: js.Array[_]): T = js.native
  def useParameter[S](parameterKey: String): js.UndefOr[S] = js.native
  def useParameter[S](parameterKey: String, defaultValue: S): js.UndefOr[S] = js.native
  def useReducer[S, A](reducer: js.Function2[/* state */ S, /* action */ A, S], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  def useReducer[S, I, A](
    reducer: js.Function2[/* state */ S, /* action */ A, S],
    initialArg: I,
    init: js.Function1[/* initialArg */ I, S]
  ): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  def useRef[T](initialValue: T): Anon_Current[T] = js.native
  def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  def useStoryContext(): StoryContext = js.native
  @js.native
  object types extends js.Object {
    /* "notes-element" */ val NOTES_ELEMENT: typingsJapgolly.atStorybookAddons.distTypesMod.types.NOTES_ELEMENT with String = js.native
    /* "panel" */ val PANEL: typingsJapgolly.atStorybookAddons.distTypesMod.types.PANEL with String = js.native
    /* "preview" */ val PREVIEW: typingsJapgolly.atStorybookAddons.distTypesMod.types.PREVIEW with String = js.native
    /* "tab" */ val TAB: typingsJapgolly.atStorybookAddons.distTypesMod.types.TAB with String = js.native
    /* "tool" */ val TOOL: typingsJapgolly.atStorybookAddons.distTypesMod.types.TOOL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.atStorybookAddons.distTypesMod.types with String] = js.native
  }
  
}

