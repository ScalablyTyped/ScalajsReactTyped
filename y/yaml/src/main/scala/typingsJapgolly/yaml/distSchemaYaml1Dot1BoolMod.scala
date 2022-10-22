package typingsJapgolly.yaml

import typingsJapgolly.yaml.distDocCreateNodeMod.CreateNodeContext
import typingsJapgolly.yaml.distNodesNodeMod.Node
import typingsJapgolly.yaml.distNodesScalarMod.Scalar
import typingsJapgolly.yaml.distOptionsMod.ParseOptions
import typingsJapgolly.yaml.distSchemaSchemaMod.Schema
import typingsJapgolly.yaml.distStringifyStringifyMod.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaYaml1Dot1BoolMod {
  
  /* Inlined yaml.yaml/dist/schema/types.ScalarTag & {  test :std.RegExp} */
  object falseTag {
    
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "falseTag")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * If `true`, together with `test` allows for values to be stringified without
      * an explicit tag. For most cases, it's unlikely that you'll actually want to
      * use this, even if you first think you do.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "falseTag.default")
    @js.native
    def default: Boolean = js.native
    
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "falseTag.collection")
    @js.native
    def collection: js.UndefOr[scala.Nothing] = js.native
    inline def collection_=(x: js.UndefOr[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collection")(x.asInstanceOf[js.Any])
    
    /**
      * An optional factory function, used e.g. by collections when wrapping JS objects as AST nodes.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "falseTag.createNode")
    @js.native
    def createNode: js.UndefOr[
        js.Function3[/* schema */ Schema, /* value */ Any, /* ctx */ CreateNodeContext, Node[Any]]
      ] = js.native
    inline def createNode_=(
      x: js.UndefOr[
          js.Function3[/* schema */ Schema, /* value */ Any, /* ctx */ CreateNodeContext, Node[Any]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createNode")(x.asInstanceOf[js.Any])
    
    inline def default_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    /**
      * If a tag has multiple forms that should be parsed and/or stringified
      * differently, use `format` to identify them.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "falseTag.format")
    @js.native
    def format: js.UndefOr[String] = js.native
    inline def format_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    /**
      * Used by `YAML.createNode` to detect your data type, e.g. using `typeof` or
      * `instanceof`.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "falseTag.identify")
    @js.native
    def identify: js.UndefOr[js.Function1[/* value */ Any, Boolean]] = js.native
    inline def identify_=(x: js.UndefOr[js.Function1[/* value */ Any, Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identify")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "falseTag.nodeClass")
    @js.native
    def nodeClass: js.UndefOr[scala.Nothing] = js.native
    inline def nodeClass_=(x: js.UndefOr[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeClass")(x.asInstanceOf[js.Any])
    
    /**
      * Turns a value into an AST node.
      * If returning a non-`Node` value, the output will be wrapped as a `Scalar`.
      */
    inline def resolve(value: String, onError: js.Function1[/* message */ String, Unit], options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Optional function stringifying a Scalar node. If your data includes a
      * suitable `.toString()` method, you can probably leave this undefined and
      * use the default stringifier.
      *
      * @param item The node being stringified.
      * @param ctx Contains the stringifying context variables.
      * @param onComment Callback to signal that the stringifier includes the
      *   item's comment in its output.
      * @param onChompKeep Callback to signal that the output uses a block scalar
      *   type with the `+` chomping indicator.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "falseTag.stringify")
    @js.native
    def stringify: js.UndefOr[
        js.Function4[
          /* item */ Scalar[Any], 
          /* ctx */ StringifyContext, 
          /* onComment */ js.UndefOr[js.Function0[Unit]], 
          /* onChompKeep */ js.UndefOr[js.Function0[Unit]], 
          String
        ]
      ] = js.native
    inline def stringify_=(
      x: js.UndefOr[
          js.Function4[
            /* item */ Scalar[Any], 
            /* ctx */ StringifyContext, 
            /* onComment */ js.UndefOr[js.Function0[Unit]], 
            /* onChompKeep */ js.UndefOr[js.Function0[Unit]], 
            String
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringify")(x.asInstanceOf[js.Any])
    
    /**
      * The identifier for your data type, with which its stringified form will be
      * prefixed. Should either be a !-prefixed local `!tag`, or a fully qualified
      * `tag:domain,date:foo`.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "falseTag.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
    
    /**
      * Together with `default` allows for values to be stringified without an
      * explicit tag and detected using a regular expression. For most cases, it's
      * unlikely that you'll actually want to use these, even if you first think
      * you do.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "falseTag.test")
    @js.native
    def test: js.UndefOr[js.RegExp] = js.native
    inline def test_=(x: js.UndefOr[js.RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined yaml.yaml/dist/schema/types.ScalarTag & {  test :std.RegExp} */
  object trueTag {
    
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "trueTag")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * If `true`, together with `test` allows for values to be stringified without
      * an explicit tag. For most cases, it's unlikely that you'll actually want to
      * use this, even if you first think you do.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "trueTag.default")
    @js.native
    def default: Boolean = js.native
    
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "trueTag.collection")
    @js.native
    def collection: js.UndefOr[scala.Nothing] = js.native
    inline def collection_=(x: js.UndefOr[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collection")(x.asInstanceOf[js.Any])
    
    /**
      * An optional factory function, used e.g. by collections when wrapping JS objects as AST nodes.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "trueTag.createNode")
    @js.native
    def createNode: js.UndefOr[
        js.Function3[/* schema */ Schema, /* value */ Any, /* ctx */ CreateNodeContext, Node[Any]]
      ] = js.native
    inline def createNode_=(
      x: js.UndefOr[
          js.Function3[/* schema */ Schema, /* value */ Any, /* ctx */ CreateNodeContext, Node[Any]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createNode")(x.asInstanceOf[js.Any])
    
    inline def default_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    /**
      * If a tag has multiple forms that should be parsed and/or stringified
      * differently, use `format` to identify them.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "trueTag.format")
    @js.native
    def format: js.UndefOr[String] = js.native
    inline def format_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    /**
      * Used by `YAML.createNode` to detect your data type, e.g. using `typeof` or
      * `instanceof`.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "trueTag.identify")
    @js.native
    def identify: js.UndefOr[js.Function1[/* value */ Any, Boolean]] = js.native
    inline def identify_=(x: js.UndefOr[js.Function1[/* value */ Any, Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identify")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "trueTag.nodeClass")
    @js.native
    def nodeClass: js.UndefOr[scala.Nothing] = js.native
    inline def nodeClass_=(x: js.UndefOr[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeClass")(x.asInstanceOf[js.Any])
    
    /**
      * Turns a value into an AST node.
      * If returning a non-`Node` value, the output will be wrapped as a `Scalar`.
      */
    inline def resolve(value: String, onError: js.Function1[/* message */ String, Unit], options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Optional function stringifying a Scalar node. If your data includes a
      * suitable `.toString()` method, you can probably leave this undefined and
      * use the default stringifier.
      *
      * @param item The node being stringified.
      * @param ctx Contains the stringifying context variables.
      * @param onComment Callback to signal that the stringifier includes the
      *   item's comment in its output.
      * @param onChompKeep Callback to signal that the output uses a block scalar
      *   type with the `+` chomping indicator.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "trueTag.stringify")
    @js.native
    def stringify: js.UndefOr[
        js.Function4[
          /* item */ Scalar[Any], 
          /* ctx */ StringifyContext, 
          /* onComment */ js.UndefOr[js.Function0[Unit]], 
          /* onChompKeep */ js.UndefOr[js.Function0[Unit]], 
          String
        ]
      ] = js.native
    inline def stringify_=(
      x: js.UndefOr[
          js.Function4[
            /* item */ Scalar[Any], 
            /* ctx */ StringifyContext, 
            /* onComment */ js.UndefOr[js.Function0[Unit]], 
            /* onChompKeep */ js.UndefOr[js.Function0[Unit]], 
            String
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringify")(x.asInstanceOf[js.Any])
    
    /**
      * The identifier for your data type, with which its stringified form will be
      * prefixed. Should either be a !-prefixed local `!tag`, or a fully qualified
      * `tag:domain,date:foo`.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "trueTag.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
    
    /**
      * Together with `default` allows for values to be stringified without an
      * explicit tag and detected using a regular expression. For most cases, it's
      * unlikely that you'll actually want to use these, even if you first think
      * you do.
      */
    @JSImport("yaml/dist/schema/yaml-1.1/bool", "trueTag.test")
    @js.native
    def test: js.UndefOr[js.RegExp] = js.native
    inline def test_=(x: js.UndefOr[js.RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])
  }
}
