package typingsJapgolly.cheerio

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cheerio.anon.FnCall
import typingsJapgolly.cheerio.anon.FnCallNameAttribsChildrenType
import typingsJapgolly.cheerio.cheerioStrings.`type`
import typingsJapgolly.cheerio.cheerioStrings.`x-attribsNamespace`
import typingsJapgolly.cheerio.cheerioStrings.`x-attribsPrefix`
import typingsJapgolly.cheerio.cheerioStrings.attribs
import typingsJapgolly.cheerio.cheerioStrings.children
import typingsJapgolly.cheerio.cheerioStrings.endIndex
import typingsJapgolly.cheerio.cheerioStrings.href
import typingsJapgolly.cheerio.cheerioStrings.innerHTML
import typingsJapgolly.cheerio.cheerioStrings.innerText
import typingsJapgolly.cheerio.cheerioStrings.name
import typingsJapgolly.cheerio.cheerioStrings.namespace
import typingsJapgolly.cheerio.cheerioStrings.next
import typingsJapgolly.cheerio.cheerioStrings.nodeName
import typingsJapgolly.cheerio.cheerioStrings.nodeType
import typingsJapgolly.cheerio.cheerioStrings.outerHTML
import typingsJapgolly.cheerio.cheerioStrings.parent
import typingsJapgolly.cheerio.cheerioStrings.prev
import typingsJapgolly.cheerio.cheerioStrings.sourceCodeLocation
import typingsJapgolly.cheerio.cheerioStrings.src
import typingsJapgolly.cheerio.cheerioStrings.startIndex
import typingsJapgolly.cheerio.cheerioStrings.style
import typingsJapgolly.cheerio.cheerioStrings.tagName
import typingsJapgolly.cheerio.cheerioStrings.textContent
import typingsJapgolly.cheerio.libEsmCheerioMod.Cheerio
import typingsJapgolly.domelementtype.mod.ElementType.Script
import typingsJapgolly.domelementtype.mod.ElementType.Style
import typingsJapgolly.domelementtype.mod.ElementType.Tag
import typingsJapgolly.domhandler.libNodeMod.AnyNode
import typingsJapgolly.domhandler.libNodeMod.ChildNode
import typingsJapgolly.domhandler.libNodeMod.ParentNode
import typingsJapgolly.domhandler.libNodeMod.TagSourceCodeLocation
import typingsJapgolly.domhandler.mod.Element
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmApiAttributesMod {
  
  @JSImport("cheerio/lib/esm/api/attributes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](): R = ^.asInstanceOf[js.Dynamic].applyDynamic("addClass")().asInstanceOf[R]
  inline def addClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](value: String): R = ^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(value.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def addClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](
    value: js.ThisFunction2[/* this */ Element, /* i */ Double, /* className */ String, js.UndefOr[String]]
  ): R = ^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(value.asInstanceOf[js.Any]).asInstanceOf[R]
  
  inline def attr[T /* <: AnyNode */](): js.UndefOr[Record[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("attr")().asInstanceOf[js.UndefOr[Record[String, String]]]
  inline def attr[T /* <: AnyNode */](name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("attr")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def attr[T /* <: AnyNode */](name: String, value: String): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def attr[T /* <: AnyNode */](
    name: String,
    value: js.ThisFunction2[/* this */ Element, /* i */ Double, /* attrib */ String, String | Null]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def attr[T /* <: AnyNode */](values: Record[String, String | Null]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("attr")(values.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def attr_T_Cheerio[T /* <: AnyNode */](name: String): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("attr")(name.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def data[T /* <: AnyNode */](): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("data")().asInstanceOf[Record[String, Any]]
  inline def data[T /* <: AnyNode */](name: String): js.UndefOr[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Any]]
  inline def data[T /* <: AnyNode */](name: String, value: Any): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("data")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def data[T /* <: AnyNode */](values: Record[String, Any]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(values.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def hasClass[T /* <: AnyNode */](className: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(className.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def prop[T /* <: AnyNode */](name: href | innerHTML | innerText | outerHTML | src | textContent): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def prop[T /* <: AnyNode */](name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def prop[T /* <: AnyNode */](name: String, value: String): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop[T /* <: AnyNode */](
    name: String,
    value: js.ThisFunction2[/* this */ Element, /* i */ Double, /* prop */ String, String | Boolean]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop[T /* <: AnyNode */](name: String, value: Boolean): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop[T /* <: AnyNode */](
    name: Record[
      String, 
      js.UndefOr[
        String | FnCall | FnCallNameAttribsChildrenType | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String] | Boolean
      ]
    ]
  ): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def prop_T_Any[T /* <: AnyNode */](name: tagName | nodeName): /* import warning: importer.ImportType#apply Failed type conversion: T extends domhandler.domhandler.Element ? string : undefined */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends domhandler.domhandler.Element ? string : undefined */ js.Any]
  
  inline def prop_T_Cheerio[T /* <: AnyNode */](name: String): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def prop_attribs[T /* <: AnyNode */](name: attribs): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  inline def prop_attribs[T /* <: AnyNode */](
    name: attribs,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      attribs, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_attribs[T /* <: AnyNode */](name: attribs, value: StringDictionary[String]): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_children[T /* <: AnyNode */](name: children): js.Array[ChildNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[ChildNode]]
  inline def prop_children[T /* <: AnyNode */](name: children, value: js.Array[ChildNode]): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_children[T /* <: AnyNode */](
    name: children,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      children, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_endIndex[T /* <: AnyNode */](name: endIndex): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  inline def prop_endIndex[T /* <: AnyNode */](name: endIndex, value: Double | Null): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_endIndex[T /* <: AnyNode */](
    name: endIndex,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      endIndex, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_name[T /* <: AnyNode */](name: name): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def prop_name[T /* <: AnyNode */](name: name, value: String): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_name[T /* <: AnyNode */](
    name: name,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      name, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_namespace[T /* <: AnyNode */](name: namespace): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def prop_namespace[T /* <: AnyNode */](name: namespace, value: js.UndefOr[String]): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_namespace[T /* <: AnyNode */](
    name: namespace,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      namespace, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_next[T /* <: AnyNode */](name: next): ChildNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[ChildNode | Null]
  inline def prop_next[T /* <: AnyNode */](name: next, value: ChildNode | Null): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_next[T /* <: AnyNode */](
    name: next,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      next, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_nodeType[T /* <: AnyNode */](name: nodeType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def prop_nodeType[T /* <: AnyNode */](
    name: nodeType,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      nodeType, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_nodeType[T /* <: AnyNode */](name: nodeType, value: Double): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_parent[T /* <: AnyNode */](name: parent): ParentNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[ParentNode | Null]
  inline def prop_parent[T /* <: AnyNode */](name: parent, value: ParentNode | Null): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_parent[T /* <: AnyNode */](
    name: parent,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      parent, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_prev[T /* <: AnyNode */](name: prev): ChildNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[ChildNode | Null]
  inline def prop_prev[T /* <: AnyNode */](name: prev, value: ChildNode | Null): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_prev[T /* <: AnyNode */](
    name: prev,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      prev, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_sourceCodeLocation[T /* <: AnyNode */](name: sourceCodeLocation): js.UndefOr[TagSourceCodeLocation | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TagSourceCodeLocation | Null]]
  inline def prop_sourceCodeLocation[T /* <: AnyNode */](name: sourceCodeLocation, value: js.UndefOr[TagSourceCodeLocation | Null]): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_sourceCodeLocation[T /* <: AnyNode */](
    name: sourceCodeLocation,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      sourceCodeLocation, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_startIndex[T /* <: AnyNode */](name: startIndex): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  inline def prop_startIndex[T /* <: AnyNode */](name: startIndex, value: Double | Null): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_startIndex[T /* <: AnyNode */](
    name: startIndex,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      startIndex, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_style[T /* <: AnyNode */](name: style): js.UndefOr[StyleProp] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[StyleProp]]
  
  inline def prop_type[T /* <: AnyNode */](name: `type`): Tag | Script | Style = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[Tag | Script | Style]
  inline def prop_type[T /* <: AnyNode */](name: `type`, value: Tag | Script | Style): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_type[T /* <: AnyNode */](
    name: `type`,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      `type`, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_xattribsNamespace[T /* <: AnyNode */](name: `x-attribsNamespace`): js.UndefOr[Record[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record[String, String]]]
  inline def prop_xattribsNamespace[T /* <: AnyNode */](name: `x-attribsNamespace`, value: js.UndefOr[Record[String, String]]): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_xattribsNamespace[T /* <: AnyNode */](
    name: `x-attribsNamespace`,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      `x-attribsNamespace`, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def prop_xattribsPrefix[T /* <: AnyNode */](name: `x-attribsPrefix`): js.UndefOr[Record[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record[String, String]]]
  inline def prop_xattribsPrefix[T /* <: AnyNode */](name: `x-attribsPrefix`, value: js.UndefOr[Record[String, String]]): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def prop_xattribsPrefix[T /* <: AnyNode */](
    name: `x-attribsPrefix`,
    value: js.ThisFunction2[
      /* this */ Element, 
      /* i */ Double, 
      `x-attribsPrefix`, 
      js.UndefOr[
        FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
      ]
    ]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  
  inline def removeAttr[T /* <: AnyNode */](name: String): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAttr")(name.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def removeClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](): R = ^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")().asInstanceOf[R]
  inline def removeClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](name: String): R = ^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(name.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def removeClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](
    name: js.ThisFunction2[/* this */ Element, /* i */ Double, /* className */ String, js.UndefOr[String]]
  ): R = ^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(name.asInstanceOf[js.Any]).asInstanceOf[R]
  
  inline def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](): R = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")().asInstanceOf[R]
  inline def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](value: String): R = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")(value.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](value: String, stateVal: Boolean): R = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")(value.asInstanceOf[js.Any], stateVal.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](
    value: js.ThisFunction3[
      /* this */ Element, 
      /* i */ Double, 
      /* className */ String, 
      /* stateVal */ js.UndefOr[Boolean], 
      String
    ]
  ): R = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")(value.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](
    value: js.ThisFunction3[
      /* this */ Element, 
      /* i */ Double, 
      /* className */ String, 
      /* stateVal */ js.UndefOr[Boolean], 
      String
    ],
    stateVal: Boolean
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")(value.asInstanceOf[js.Any], stateVal.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](value: Unit, stateVal: Boolean): R = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")(value.asInstanceOf[js.Any], stateVal.asInstanceOf[js.Any])).asInstanceOf[R]
  
  inline def `val`[T /* <: AnyNode */](): js.UndefOr[String | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("val")().asInstanceOf[js.UndefOr[String | js.Array[String]]]
  inline def `val`[T /* <: AnyNode */](value: String): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("val")(value.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  inline def `val`[T /* <: AnyNode */](value: js.Array[String]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("val")(value.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  trait StyleProp
    extends StObject
       with /* index */ NumberDictionary[String]
       with /* key */ StringDictionary[String | Double] {
    
    var length: Double
  }
  object StyleProp {
    
    inline def apply(length: Double): StyleProp = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleProp]
    }
    
    extension [Self <: StyleProp](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
