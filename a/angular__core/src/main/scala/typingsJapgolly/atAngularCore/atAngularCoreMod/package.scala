package typingsJapgolly.atAngularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAngularCoreMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsJapgolly.atAngularCore.Anon_NameTargetEventTarget
  import typingsJapgolly.atAngularCore.CssSelector
  import typingsJapgolly.atAngularCore.DirectiveDefList
  import typingsJapgolly.atAngularCore.DirectiveTypeList
  import typingsJapgolly.atAngularCore.PipeDefList
  import typingsJapgolly.atAngularCore.PipeTypeList
  import typingsJapgolly.atAngularCore.PropertyAliasValue
  import typingsJapgolly.std.Iterable

  type CollectionChangeRecord[V] = IterableChangeRecord[V]
  type ComponentInstance = js.Object
  /**
    * Definition of what a template rendering function should look like for a component.
    */
  type ComponentTemplate[T] = js.Function2[/* rf */ ɵRenderFlags, /* ctx */ T, Unit]
  type ContentChild = Query
  type ContentChildren = Query
  /**
    * Definition of what a content queries function should look like.
    */
  type ContentQueriesFunction[T] = js.Function3[/* rf */ ɵRenderFlags, /* ctx */ T, /* directiveIndex */ Double, Unit]
  /**
    * Factory for ViewDefinitions/NgModuleDefinitions.
    * We use a function so we can reexeute it in case an error happens and use the given logger
    * function to log the error from the definition of the node, which is shown in all browser
    * logs.
    */
  type DefinitionFactory[D /* <: Definition[_] */] = js.Function1[/* logger */ NodeLogger, D]
  /**
    * Type used for directiveDefs on component definition.
    *
    * The function is necessary to be able to support forward declarations.
    */
  type DirectiveDefListOrFactory = js.Function0[DirectiveDefList] | DirectiveDefList
  type DirectiveInstance = js.Object
  type DirectiveTypesOrFactory = js.Function0[DirectiveTypeList] | DirectiveTypeList
  type DisposableFn = js.Function0[Unit]
  type ElementHandleEventFn = js.Function3[/* view */ ViewData, /* eventName */ String, /* event */ js.Any, Boolean]
  /**
    * Set of instructions used to process host bindings efficiently.
    *
    * See VIEW_DATA.md for more information.
    */
  type ExpandoInstructions = js.Array[Double | HostBindingsFunction[js.Any] | Null]
  type ForwardRefFn = js.Function0[js.Any]
  type GlobalTargetResolver = js.Function1[/* element */ js.Any, Anon_NameTargetEventTarget]
  type HostBindingsFunction[T] = js.Function3[/* rf */ ɵRenderFlags, /* ctx */ T, /* elementIndex */ Double, Unit]
  /** See CreateComponentOptions.hostFeatures */
  type HostFeature = js.Function2[/* component */ js.Any, /* componentDef */ ɵComponentDef[js.Any], Unit]
  /**
    * Array storing OpCode for dynamically creating `i18n` blocks.
    *
    * Example:
    * ```ts
    * <I18nCreateOpCode>[
    *   // For adding text nodes
    *   // ---------------------
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createTextNode('abc');
    *   //   lView[1].insertBefore(node, lView[2]);
    *   'abc', 1 << SHIFT_PARENT | 2 << SHIFT_REF | InsertBefore,
    *
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createTextNode('xyz');
    *   //   lView[1].appendChild(node);
    *   'xyz', 1 << SHIFT_PARENT | AppendChild,
    *
    *   // For adding element nodes
    *   // ---------------------
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createElement('div');
    *   //   lView[1].insertBefore(node, lView[2]);
    *   ELEMENT_MARKER, 'div', 1 << SHIFT_PARENT | 2 << SHIFT_REF | InsertBefore,
    *
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createElement('div');
    *   //   lView[1].appendChild(node);
    *   ELEMENT_MARKER, 'div', 1 << SHIFT_PARENT | AppendChild,
    *
    *   // For adding comment nodes
    *   // ---------------------
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createComment('');
    *   //   lView[1].insertBefore(node, lView[2]);
    *   COMMENT_MARKER, '', 1 << SHIFT_PARENT | 2 << SHIFT_REF | InsertBefore,
    *
    *   // Equivalent to:
    *   //   const node = lView[index++] = document.createComment('');
    *   //   lView[1].appendChild(node);
    *   COMMENT_MARKER, '', 1 << SHIFT_PARENT | AppendChild,
    *
    *   // For moving existing nodes to a different location
    *   // --------------------------------------------------
    *   // Equivalent to:
    *   //   const node = lView[1];
    *   //   lView[2].insertBefore(node, lView[3]);
    *   1 << SHIFT_REF | Select, 2 << SHIFT_PARENT | 3 << SHIFT_REF | InsertBefore,
    *
    *   // Equivalent to:
    *   //   const node = lView[1];
    *   //   lView[2].appendChild(node);
    *   1 << SHIFT_REF | Select, 2 << SHIFT_PARENT | AppendChild,
    *
    *   // For removing existing nodes
    *   // --------------------------------------------------
    *   //   const node = lView[1];
    *   //   removeChild(tView.data(1), node, lView);
    *   1 << SHIFT_REF | Remove,
    *
    *   // For writing attributes
    *   // --------------------------------------------------
    *   //   const node = lView[1];
    *   //   node.setAttribute('attr', 'value');
    *   1 << SHIFT_REF | Select, 'attr', 'value'
    *            // NOTE: Select followed by two string (vs select followed by OpCode)
    * ];
    * ```
    * NOTE:
    *   - `index` is initial location where the extra nodes should be stored in the EXPANDO section of
    * `LVIewData`.
    *
    * See: `applyI18nCreateOpCodes`;
    */
  type I18nMutateOpCodes = js.Array[Double | String | ELEMENT_MARKER | COMMENT_MARKER | Null]
  /**
    * Stores DOM operations which need to be applied to update DOM render tree due to changes in
    * expressions.
    *
    * The basic idea is that `i18nExp` OpCodes capture expression changes and update a change
    * mask bit. (Bit 1 for expression 1, bit 2 for expression 2 etc..., bit 32 for expression 32 and
    * higher.) The OpCodes then compare its own change mask against the expression change mask to
    * determine if the OpCodes should execute.
    *
    * These OpCodes can be used by both the i18n block as well as ICU sub-block.
    *
    * ## Example
    *
    * Assume
    * ```ts
    *   if (rf & RenderFlags.Update) {
    *    i18nExp(bind(ctx.exp1)); // If changed set mask bit 1
    *    i18nExp(bind(ctx.exp2)); // If changed set mask bit 2
    *    i18nExp(bind(ctx.exp3)); // If changed set mask bit 3
    *    i18nExp(bind(ctx.exp4)); // If changed set mask bit 4
    *    i18nApply(0);            // Apply all changes by executing the OpCodes.
    *  }
    * ```
    * We can assume that each call to `i18nExp` sets an internal `changeMask` bit depending on the
    * index of `i18nExp`.
    *
    * ### OpCodes
    * ```ts
    * <I18nUpdateOpCodes>[
    *   // The following OpCodes represent: `<div i18n-title="pre{{exp1}}in{{exp2}}post">`
    *   // If `changeMask & 0b11`
    *   //        has changed then execute update OpCodes.
    *   //        has NOT changed then skip `7` values and start processing next OpCodes.
    *   0b11, 7,
    *   // Concatenate `newValue = 'pre'+lView[bindIndex-4]+'in'+lView[bindIndex-3]+'post';`.
    *   'pre', -4, 'in', -3, 'post',
    *   // Update attribute: `elementAttribute(1, 'title', sanitizerFn(newValue));`
    *   1 << SHIFT_REF | Attr, 'title', sanitizerFn,
    *
    *   // The following OpCodes represent: `<div i18n>Hello {{exp3}}!">`
    *   // If `changeMask & 0b100`
    *   //        has changed then execute update OpCodes.
    *   //        has NOT changed then skip `4` values and start processing next OpCodes.
    *   0b100, 4,
    *   // Concatenate `newValue = 'Hello ' + lView[bindIndex -2] + '!';`.
    *   'Hello ', -2, '!',
    *   // Update text: `lView[1].textContent = newValue;`
    *   1 << SHIFT_REF | Text,
    *
    *   // The following OpCodes represent: `<div i18n>{exp4, plural, ... }">`
    *   // If `changeMask & 0b1000`
    *   //        has changed then execute update OpCodes.
    *   //        has NOT changed then skip `4` values and start processing next OpCodes.
    *   0b1000, 4,
    *   // Concatenate `newValue = lView[bindIndex -1];`.
    *   -1,
    *   // Switch ICU: `icuSwitchCase(lView[1], 0, newValue);`
    *   0 << SHIFT_ICU | 1 << SHIFT_REF | IcuSwitch,
    *
    *   // Note `changeMask & -1` is always true, so the IcuUpdate will always execute.
    *   -1, 1,
    *   // Update ICU: `icuUpdateCase(lView[1], 0);`
    *   0 << SHIFT_ICU | 1 << SHIFT_REF | IcuUpdate,
    *
    * ];
    * ```
    *
    */
  type I18nUpdateOpCodes = js.Array[String | Double | SanitizerFn | Null]
  /**
    * Type for a function that extracts a value for a local refs.
    * Example:
    * - `<div #nativeDivEl>` - `nativeDivEl` should point to the native `<div>` element;
    * - `<ng-template #tplRef>` - `tplRef` should point to the `TemplateRef` instance;
    */
  type LocalRefExtractor = js.Function2[
    /* tNode */ TNodeWithLocalRefs, 
    /* currentView */ ɵangular_packages_core_core_bj, 
    js.Any
  ]
  type NgIterable[T] = js.Array[T] | Iterable[T]
  /**
    * Function to call console.error at the right source location. This is an indirection
    * via another function as browser will log the location that actually called
    * `console.error`.
    */
  type NodeLogger = js.Function0[js.Function0[Unit]]
  /**
    * Type used for PipeDefs on component definition.
    *
    * The function is necessary to be able to support forward declarations.
    */
  type PipeDefListOrFactory = js.Function0[PipeDefList] | PipeDefList
  type PipeTypesOrFactory = js.Function0[PipeTypeList] | PipeTypeList
  type Predicate[T] = js.Function1[/* value */ T, Boolean]
  /**
    * Describes a function that is used to process provider lists (such as provider
    * overrides).
    */
  type ProcessProvidersFunction = js.Function1[/* providers */ js.Array[Provider], js.Array[Provider]]
  /**
    * This mapping is necessary so we can set input properties and output listeners
    * properly at runtime when property names are minified or aliased.
    *
    * Key: unminified / public input or output name
    * Value: array containing minified / internal name and related directive index
    *
    * The value must be an array to support inputs and outputs with the same name
    * on the same node.
    */
  type PropertyAliases = StringDictionary[PropertyAliasValue]
  /* Rewritten from type alias, can be one of: 
    - typings.atAngularCore.atAngularCoreMod.TypeProvider
    - typings.atAngularCore.atAngularCoreMod.ValueProvider
    - typings.atAngularCore.atAngularCoreMod.ClassProvider
    - typings.atAngularCore.atAngularCoreMod.ConstructorProvider
    - typings.atAngularCore.atAngularCoreMod.ExistingProvider
    - typings.atAngularCore.atAngularCoreMod.FactoryProvider
    - js.Array[js.Any]
  */
  type Provider = _Provider | js.Array[js.Any] | TypeProvider
  /**
    * Function used to sanitize the value before writing it into the renderer.
    */
  type SanitizerFn = js.Function3[
    /* value */ js.Any, 
    /* tagName */ js.UndefOr[String], 
    /* propName */ js.UndefOr[String], 
    String
  ]
  type Scope = js.Function1[/* repeated */ js.Any, js.Any]
  type SimpleChanges = StringDictionary[SimpleChange]
  /* Rewritten from type alias, can be one of: 
    - typings.atAngularCore.atAngularCoreMod.ValueProvider
    - typings.atAngularCore.atAngularCoreMod.ExistingProvider
    - typings.atAngularCore.atAngularCoreMod.StaticClassProvider
    - typings.atAngularCore.atAngularCoreMod.ConstructorProvider
    - typings.atAngularCore.atAngularCoreMod.FactoryProvider
    - js.Array[js.Any]
  */
  type StaticProvider = _StaticProvider | js.Array[js.Any]
  /**
    * Used to intercept and sanitize style values before they are written to the renderer.
    *
    * This function is designed to be called in two modes. When a value is not provided
    * then the function will return a boolean whether a property will be sanitized later.
    * If a value is provided then the sanitized version of that will be returned.
    */
  type StyleSanitizeFn = js.Function3[
    /* prop */ String, 
    /* value */ String | Null, 
    /* mode */ js.UndefOr[StyleSanitizeMode], 
    js.Any
  ]
  type TrackByFunction[T] = js.Function2[/* index */ Double, /* item */ T, js.Any]
  type TypeProvider = Type[js.Any]
  type ViewChild = Query
  type ViewChildren = Query
  type ViewHandleEventFn = js.Function4[
    /* view */ ViewData, 
    /* nodeIndex */ Double, 
    /* eventName */ String, 
    /* event */ js.Any, 
    Boolean
  ]
  /**
    * Definition of what a view queries function should look like.
    */
  type ViewQueriesFunction[T] = js.Function2[/* rf */ ɵRenderFlags, /* ctx */ T, Unit]
  type ViewUpdateFn = js.Function2[/* check */ NodeCheckFn, /* view */ ViewData, Unit]
  type WtfScopeFn = js.Function2[/* arg0 */ js.UndefOr[js.Any], /* arg1 */ js.UndefOr[js.Any], js.Any]
  type viewEngine_ChangeDetectorRef_interface = ChangeDetectorRef
  type ɵCssSelectorList = js.Array[CssSelector]
  type ɵGetterFn = js.Function1[/* obj */ js.Any, js.Any]
  type ɵMethodFn = js.Function2[/* obj */ js.Any, /* args */ js.Array[js.Any], js.Any]
  type ɵSetterFn = js.Function2[/* obj */ js.Any, /* value */ js.Any, Unit]
  type ɵɵComponentDefWithMeta[T, Selector /* <: String */, ExportAs /* <: js.Array[String] */, InputMap /* <: StringDictionary[String] */, OutputMap /* <: StringDictionary[String] */, QueryFields /* <: js.Array[String] */] = ɵComponentDef[T]
  type ɵɵDirectiveDefWithMeta[T, Selector /* <: String */, ExportAs /* <: js.Array[String] */, InputMap /* <: StringDictionary[String] */, OutputMap /* <: StringDictionary[String] */, QueryFields /* <: js.Array[String] */] = ɵDirectiveDef[T]
  type ɵɵNgModuleDefWithMeta[T, Declarations, Imports, Exports] = ɵNgModuleDef[T]
  type ɵɵPipeDefWithMeta[T, Name /* <: String */] = ɵPipeDef[T]
}
