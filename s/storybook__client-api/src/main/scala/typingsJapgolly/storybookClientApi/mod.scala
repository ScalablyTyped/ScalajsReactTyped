package typingsJapgolly.storybookClientApi

import typingsJapgolly.storybookAddons.AnonCurrent
import typingsJapgolly.storybookAddons.hooksMod.Decorator
import typingsJapgolly.storybookAddons.hooksMod.EventMap
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.typesMod.Parameters
import typingsJapgolly.storybookAddons.typesMod.StoryContext
import typingsJapgolly.storybookAddons.typesMod.StoryFn
import typingsJapgolly.storybookAddons.typesMod.StoryGetter
import typingsJapgolly.storybookClientApi.clientApiMod.default
import typingsJapgolly.storybookClientApi.typesMod.ClientApiParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/client-api", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ClientApi protected () extends default {
    def this(hasStoryStoreDecorateStory: ClientApiParams) = this()
  }
  
  @js.native
  class ConfigApi protected ()
    extends typingsJapgolly.storybookClientApi.configApiMod.default {
    def this(hasChannelStoryStoreClientApiClearDecorators: AnonChannel) = this()
  }
  
  @js.native
  class HooksContext ()
    extends typingsJapgolly.storybookClientApi.hooksMod.HooksContext
  
  @js.native
  class StoryStore protected ()
    extends typingsJapgolly.storybookClientApi.storyStoreMod.default {
    def this(params: AnonChannelChannel) = this()
  }
  
  def addDecorator(decoratorFn: DecoratorFunction[_]): Unit = js.native
  def addParameters(parameters: Parameters): Unit = js.native
  def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
  def defaultDecorateStory(storyFn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): StoryFn[_] = js.native
  def getQueryParam(key: String): String | Unit = js.native
  def getQueryParams(): js.Any = js.native
  def pathToId(path: String): String = js.native
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
  object subscriptionsStore extends js.Object {
    def clearUnused(): Unit = js.native
    def markAllAsUnused(): Unit = js.native
    def register(subscribe: js.Function0[Unit]): Unit = js.native
  }
  
}

