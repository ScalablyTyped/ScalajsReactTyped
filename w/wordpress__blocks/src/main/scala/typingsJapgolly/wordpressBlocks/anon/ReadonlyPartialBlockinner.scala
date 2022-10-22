package typingsJapgolly.wordpressBlocks.anon

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlocks.mod.BlockDeprecation
import typingsJapgolly.wordpressBlocks.mod.BlockEditProps
import typingsJapgolly.wordpressBlocks.mod.BlockExampleInnerBlock
import typingsJapgolly.wordpressBlocks.mod.BlockIconNormalized
import typingsJapgolly.wordpressBlocks.mod.BlockSaveProps
import typingsJapgolly.wordpressBlocks.mod.BlockStyle
import typingsJapgolly.wordpressBlocks.mod.BlockSupports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Partial<@wordpress/blocks.@wordpress/blocks.Block<{}>> & {  innerBlocks :std.ReadonlyArray<@wordpress/blocks.@wordpress/blocks.BlockExampleInnerBlock> | undefined}> */
trait ReadonlyPartialBlockinner extends StObject {
  
  val apiVersion: js.UndefOr[Double] = js.undefined
  
  val attributes: js.UndefOr[js.Object] = js.undefined
  
  val category: js.UndefOr[String] = js.undefined
  
  val deprecated: js.UndefOr[js.Array[BlockDeprecation[js.Object, Record[String, Any]]]] = js.undefined
  
  val description: js.UndefOr[String] = js.undefined
  
  val edit: js.UndefOr[ComponentType[BlockEditProps[js.Object]]] = js.undefined
  
  val editorScript: js.UndefOr[String] = js.undefined
  
  val editorStyle: js.UndefOr[String] = js.undefined
  
  val example: js.UndefOr[PartialBlockinnerBlocksRe] = js.undefined
  
  val getEditWrapperProps: js.UndefOr[js.Function1[/* attrs */ js.Object, Record[String, String | Double | Boolean]]] = js.undefined
  
  val icon: js.UndefOr[BlockIconNormalized] = js.undefined
  
  val innerBlocks: js.UndefOr[js.Array[BlockExampleInnerBlock]] = js.undefined
  
  val keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  val merge: js.UndefOr[
    js.Function2[/* attributes */ js.Object, /* attributesToMerge */ js.Object, js.Object]
  ] = js.undefined
  
  val name: js.UndefOr[String] = js.undefined
  
  val parent: js.UndefOr[js.Array[String]] = js.undefined
  
  val providesContext: js.UndefOr[Record[String, /* keyof {} */ String]] = js.undefined
  
  val save: js.UndefOr[ComponentType[BlockSaveProps[js.Object]]] = js.undefined
  
  val script: js.UndefOr[String] = js.undefined
  
  val style: js.UndefOr[String] = js.undefined
  
  val styles: js.UndefOr[js.Array[BlockStyle]] = js.undefined
  
  val supports: js.UndefOr[BlockSupports] = js.undefined
  
  val textdomain: js.UndefOr[String] = js.undefined
  
  val title: js.UndefOr[String] = js.undefined
  
  val transforms: js.UndefOr[From] = js.undefined
  
  val usesContext: js.UndefOr[js.Array[String]] = js.undefined
  
  val version: js.UndefOr[String] = js.undefined
}
object ReadonlyPartialBlockinner {
  
  inline def apply(): ReadonlyPartialBlockinner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPartialBlockinner]
  }
  
  extension [Self <: ReadonlyPartialBlockinner](x: Self) {
    
    inline def setApiVersion(value: Double): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDeprecated(value: js.Array[BlockDeprecation[js.Object, Record[String, Any]]]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDeprecatedVarargs(value: (BlockDeprecation[js.Object, Record[String, Any]])*): Self = StObject.set(x, "deprecated", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEdit(value: ComponentType[BlockEditProps[js.Object]]): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setEditorScript(value: String): Self = StObject.set(x, "editorScript", value.asInstanceOf[js.Any])
    
    inline def setEditorScriptUndefined: Self = StObject.set(x, "editorScript", js.undefined)
    
    inline def setEditorStyle(value: String): Self = StObject.set(x, "editorStyle", value.asInstanceOf[js.Any])
    
    inline def setEditorStyleUndefined: Self = StObject.set(x, "editorStyle", js.undefined)
    
    inline def setExample(value: PartialBlockinnerBlocksRe): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setGetEditWrapperProps(value: /* attrs */ js.Object => Record[String, String | Double | Boolean]): Self = StObject.set(x, "getEditWrapperProps", js.Any.fromFunction1(value))
    
    inline def setGetEditWrapperPropsUndefined: Self = StObject.set(x, "getEditWrapperProps", js.undefined)
    
    inline def setIcon(value: BlockIconNormalized): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInnerBlocks(value: js.Array[BlockExampleInnerBlock]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
    
    inline def setInnerBlocksUndefined: Self = StObject.set(x, "innerBlocks", js.undefined)
    
    inline def setInnerBlocksVarargs(value: BlockExampleInnerBlock*): Self = StObject.set(x, "innerBlocks", js.Array(value*))
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setMerge(value: (/* attributes */ js.Object, /* attributesToMerge */ js.Object) => js.Object): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: js.Array[String]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setParentVarargs(value: String*): Self = StObject.set(x, "parent", js.Array(value*))
    
    inline def setProvidesContext(value: Record[String, /* keyof {} */ String]): Self = StObject.set(x, "providesContext", value.asInstanceOf[js.Any])
    
    inline def setProvidesContextUndefined: Self = StObject.set(x, "providesContext", js.undefined)
    
    inline def setSave(value: ComponentType[BlockSaveProps[js.Object]]): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: js.Array[BlockStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: BlockStyle*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setSupports(value: BlockSupports): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
    
    inline def setTextdomain(value: String): Self = StObject.set(x, "textdomain", value.asInstanceOf[js.Any])
    
    inline def setTextdomainUndefined: Self = StObject.set(x, "textdomain", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransforms(value: From): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
    
    inline def setUsesContext(value: js.Array[String]): Self = StObject.set(x, "usesContext", value.asInstanceOf[js.Any])
    
    inline def setUsesContextUndefined: Self = StObject.set(x, "usesContext", js.undefined)
    
    inline def setUsesContextVarargs(value: String*): Self = StObject.set(x, "usesContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
