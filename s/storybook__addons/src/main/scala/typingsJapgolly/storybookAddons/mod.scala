package typingsJapgolly.storybookAddons

import typingsJapgolly.storybookAddons.hooksMod.Decorator
import typingsJapgolly.storybookAddons.hooksMod.EventMap
import typingsJapgolly.storybookAddons.makeDecoratorMod.MakeDecoratorOptions
import typingsJapgolly.storybookAddons.makeDecoratorMod.MakeDecoratorResult
import typingsJapgolly.storybookAddons.typesMod.StoryContext
import typingsJapgolly.storybookAddons.typesMod.StoryGetter
import typingsJapgolly.storybookAddons.typesMod.Types_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AddonStore ()
    extends typingsJapgolly.storybookAddons.distMod.AddonStore
  
  @js.native
  class HooksContext ()
    extends typingsJapgolly.storybookAddons.hooksMod.HooksContext
  
  val addons: typingsJapgolly.storybookAddons.distMod.AddonStore = js.native
  val default: typingsJapgolly.storybookAddons.distMod.AddonStore = js.native
  def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
  def isSupportedType(`type`: Types_): Boolean = js.native
  def makeDecorator(hasNameParameterNameWrapperSkipIfNoParametersOrOptionsAllowDeprecatedUsage: MakeDecoratorOptions): MakeDecoratorResult = js.native
  def mockChannel(): typingsJapgolly.storybookChannels.mod.default = js.native
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
  def useRef[T](initialValue: T): AnonCurrent[T] = js.native
  def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  def useStoryContext(): StoryContext = js.native
  @js.native
  object types extends js.Object {
    /* "notes-element" */ val NOTES_ELEMENT: typingsJapgolly.storybookAddons.typesMod.types.NOTES_ELEMENT with String = js.native
    /* "panel" */ val PANEL: typingsJapgolly.storybookAddons.typesMod.types.PANEL with String = js.native
    /* "preview" */ val PREVIEW: typingsJapgolly.storybookAddons.typesMod.types.PREVIEW with String = js.native
    /* "tab" */ val TAB: typingsJapgolly.storybookAddons.typesMod.types.TAB with String = js.native
    /* "tool" */ val TOOL: typingsJapgolly.storybookAddons.typesMod.types.TOOL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.storybookAddons.typesMod.types with String] = js.native
  }
  
}

