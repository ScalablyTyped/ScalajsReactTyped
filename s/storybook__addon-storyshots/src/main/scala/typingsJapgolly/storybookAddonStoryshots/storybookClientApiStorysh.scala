package typingsJapgolly.storybookAddonStoryshots

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.glob.mod.IOptions
import typingsJapgolly.storybookAddonStoryshots.frameworksLoaderMod.ClientApi
import typingsJapgolly.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import typingsJapgolly.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverter
import typingsJapgolly.storybookAddonStoryshots.storybookAddonStoryshotsBooleans.`false`
import typingsJapgolly.storybookAddonStoryshots.supportedFrameworkMod.SupportedFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  storybook  :@storybook/addon-storyshots.@storybook/addon-storyshots/dist/frameworks/Loader.ClientApi} & @storybook/addon-storyshots.@storybook/addon-storyshots/dist/api/StoryshotsOptions.StoryshotsOptions */
trait storybookClientApiStorysh extends js.Object {
  var asyncJest: js.UndefOr[Boolean] = js.undefined
  var config: js.UndefOr[js.Function1[/* options */ js.Any, Unit]] = js.undefined
  var configPath: js.UndefOr[String] = js.undefined
  var framework: js.UndefOr[SupportedFramework] = js.undefined
  var integrityOptions: js.UndefOr[IOptions | `false`] = js.undefined
  var renderer: js.UndefOr[js.Function] = js.undefined
  /**
    * @Deprecated The functionality of this option is completely covered by snapshotSerializers which should be used instead.
    */
  var serializer: js.UndefOr[js.Any] = js.undefined
  var snapshotSerializers: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.SnapshotSerializerPlugin */ _
    ]
  ] = js.undefined
  var stories2snapsConverter: js.UndefOr[Stories2SnapsConverter] = js.undefined
  var storyKindRegex: js.UndefOr[js.RegExp | String] = js.undefined
  var storyNameRegex: js.UndefOr[js.RegExp | String] = js.undefined
  var storybook: ClientApi
  var suite: js.UndefOr[String] = js.undefined
  var test: js.UndefOr[
    js.Function4[
      /* story */ js.Any, 
      /* context */ js.Any, 
      /* renderTree */ RenderTree, 
      /* options */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
}

object storybookClientApiStorysh {
  @scala.inline
  def apply(
    storybook: ClientApi,
    asyncJest: js.UndefOr[Boolean] = js.undefined,
    config: /* options */ js.Any => Callback = null,
    configPath: String = null,
    framework: SupportedFramework = null,
    integrityOptions: IOptions | `false` = null,
    renderer: js.Function = null,
    serializer: js.Any = null,
    snapshotSerializers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.SnapshotSerializerPlugin */ _
    ] = null,
    stories2snapsConverter: Stories2SnapsConverter = null,
    storyKindRegex: js.RegExp | String = null,
    storyNameRegex: js.RegExp | String = null,
    suite: String = null,
    test: (/* story */ js.Any, /* context */ js.Any, /* renderTree */ RenderTree, /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null
  ): storybookClientApiStorysh = {
    val __obj = js.Dynamic.literal(storybook = storybook.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncJest)) __obj.updateDynamic("asyncJest")(asyncJest.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(js.Any.fromFunction1((t0: /* options */ js.Any) => config(t0).runNow()))
    if (configPath != null) __obj.updateDynamic("configPath")(configPath.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (integrityOptions != null) __obj.updateDynamic("integrityOptions")(integrityOptions.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(serializer.asInstanceOf[js.Any])
    if (snapshotSerializers != null) __obj.updateDynamic("snapshotSerializers")(snapshotSerializers.asInstanceOf[js.Any])
    if (stories2snapsConverter != null) __obj.updateDynamic("stories2snapsConverter")(stories2snapsConverter.asInstanceOf[js.Any])
    if (storyKindRegex != null) __obj.updateDynamic("storyKindRegex")(storyKindRegex.asInstanceOf[js.Any])
    if (storyNameRegex != null) __obj.updateDynamic("storyNameRegex")(storyNameRegex.asInstanceOf[js.Any])
    if (suite != null) __obj.updateDynamic("suite")(suite.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction4((t0: /* story */ js.Any, t1: /* context */ js.Any, t2: /* renderTree */ typingsJapgolly.storybookAddonStoryshots.frameworksLoaderMod.RenderTree, t3: /* options */ js.UndefOr[js.Any]) => test(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[storybookClientApiStorysh]
  }
}

