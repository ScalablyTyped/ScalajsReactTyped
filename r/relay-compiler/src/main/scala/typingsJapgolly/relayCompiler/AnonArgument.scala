package typingsJapgolly.relayCompiler

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayCompiler.iRMod.Argument
import typingsJapgolly.relayCompiler.iRMod.ClientExtension
import typingsJapgolly.relayCompiler.iRMod.Condition
import typingsJapgolly.relayCompiler.iRMod.Defer
import typingsJapgolly.relayCompiler.iRMod.Directive
import typingsJapgolly.relayCompiler.iRMod.Fragment
import typingsJapgolly.relayCompiler.iRMod.FragmentSpread
import typingsJapgolly.relayCompiler.iRMod.InlineFragment
import typingsJapgolly.relayCompiler.iRMod.LinkedField
import typingsJapgolly.relayCompiler.iRMod.Literal
import typingsJapgolly.relayCompiler.iRMod.LocalArgumentDefinition
import typingsJapgolly.relayCompiler.iRMod.ModuleImport
import typingsJapgolly.relayCompiler.iRMod.Request
import typingsJapgolly.relayCompiler.iRMod.Root
import typingsJapgolly.relayCompiler.iRMod.RootArgumentDefinition
import typingsJapgolly.relayCompiler.iRMod.ScalarField
import typingsJapgolly.relayCompiler.iRMod.SplitOperation
import typingsJapgolly.relayCompiler.iRMod.Stream
import typingsJapgolly.relayCompiler.iRMod.Variable
import typingsJapgolly.relayCompiler.irvisitorMod.VisitFn
import typingsJapgolly.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgument extends js.Object {
  var Argument: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.Argument]] = js.undefined
  var ClientExtension: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.ClientExtension]] = js.undefined
  var Condition: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.Condition]] = js.undefined
  var Defer: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.Defer]] = js.undefined
  var Directive: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.Directive]] = js.undefined
  var Fragment: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.Fragment]] = js.undefined
  var FragmentSpread: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.FragmentSpread]] = js.undefined
  var InlineFragment: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.InlineFragment]] = js.undefined
  var LinkedField: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.LinkedField]] = js.undefined
  var Literal: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.Literal]] = js.undefined
  var LocalArgumentDefinition: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.LocalArgumentDefinition]] = js.undefined
  var ModuleImport: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.ModuleImport]] = js.undefined
  var Request: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.Request]] = js.undefined
  var Root: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.Root]] = js.undefined
  var RootArgumentDefinition: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.RootArgumentDefinition]] = js.undefined
  var ScalarField: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.ScalarField]] = js.undefined
  var SplitOperation: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.SplitOperation]] = js.undefined
  var Stream: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.Stream]] = js.undefined
  var Variable: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.Variable]] = js.undefined
}

object AnonArgument {
  @scala.inline
  def apply(
    Argument: (Argument, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    ClientExtension: (ClientExtension, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    Condition: (Condition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    Defer: (Defer, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    Directive: (Directive, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    Fragment: (Fragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    FragmentSpread: (FragmentSpread, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    InlineFragment: (InlineFragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    LinkedField: (LinkedField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    Literal: (Literal, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    LocalArgumentDefinition: (LocalArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    ModuleImport: (ModuleImport, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    Request: (Request, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    Root: (Root, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    RootArgumentDefinition: (RootArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    ScalarField: (ScalarField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    SplitOperation: (SplitOperation, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    Stream: (Stream, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    Variable: (Variable, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null
  ): AnonArgument = {
    val __obj = js.Dynamic.literal()
    if (Argument != null) __obj.updateDynamic("Argument")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.Argument, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => Argument(t0, t1, t2, t3, t4).runNow()))
    if (ClientExtension != null) __obj.updateDynamic("ClientExtension")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.ClientExtension, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => ClientExtension(t0, t1, t2, t3, t4).runNow()))
    if (Condition != null) __obj.updateDynamic("Condition")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.Condition, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => Condition(t0, t1, t2, t3, t4).runNow()))
    if (Defer != null) __obj.updateDynamic("Defer")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.Defer, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => Defer(t0, t1, t2, t3, t4).runNow()))
    if (Directive != null) __obj.updateDynamic("Directive")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.Directive, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => Directive(t0, t1, t2, t3, t4).runNow()))
    if (Fragment != null) __obj.updateDynamic("Fragment")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.Fragment, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => Fragment(t0, t1, t2, t3, t4).runNow()))
    if (FragmentSpread != null) __obj.updateDynamic("FragmentSpread")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.FragmentSpread, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => FragmentSpread(t0, t1, t2, t3, t4).runNow()))
    if (InlineFragment != null) __obj.updateDynamic("InlineFragment")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.InlineFragment, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => InlineFragment(t0, t1, t2, t3, t4).runNow()))
    if (LinkedField != null) __obj.updateDynamic("LinkedField")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.LinkedField, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => LinkedField(t0, t1, t2, t3, t4).runNow()))
    if (Literal != null) __obj.updateDynamic("Literal")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.Literal, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => Literal(t0, t1, t2, t3, t4).runNow()))
    if (LocalArgumentDefinition != null) __obj.updateDynamic("LocalArgumentDefinition")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.LocalArgumentDefinition, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => LocalArgumentDefinition(t0, t1, t2, t3, t4).runNow()))
    if (ModuleImport != null) __obj.updateDynamic("ModuleImport")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.ModuleImport, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => ModuleImport(t0, t1, t2, t3, t4).runNow()))
    if (Request != null) __obj.updateDynamic("Request")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.Request, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => Request(t0, t1, t2, t3, t4).runNow()))
    if (Root != null) __obj.updateDynamic("Root")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.Root, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => Root(t0, t1, t2, t3, t4).runNow()))
    if (RootArgumentDefinition != null) __obj.updateDynamic("RootArgumentDefinition")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.RootArgumentDefinition, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => RootArgumentDefinition(t0, t1, t2, t3, t4).runNow()))
    if (ScalarField != null) __obj.updateDynamic("ScalarField")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.ScalarField, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => ScalarField(t0, t1, t2, t3, t4).runNow()))
    if (SplitOperation != null) __obj.updateDynamic("SplitOperation")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.SplitOperation, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => SplitOperation(t0, t1, t2, t3, t4).runNow()))
    if (Stream != null) __obj.updateDynamic("Stream")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.Stream, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => Stream(t0, t1, t2, t3, t4).runNow()))
    if (Variable != null) __obj.updateDynamic("Variable")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.Variable, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => Variable(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[AnonArgument]
  }
}

