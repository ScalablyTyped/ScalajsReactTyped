package typingsJapgolly.apidoc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apidoc.mod.ParsedFile
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.Array[Record[String, Any]]
    
    var project: Record[String, Any]
  }
  object Data {
    
    inline def apply(data: js.Array[Record[String, Any]], project: Record[String, Any]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setProject(value: Record[String, Any]): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: String
    
    var name: String
    
    var title: String
  }
  object Description {
    
    inline def apply(description: String, name: String, title: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocBlocksRegExp extends StObject {
    
    var docBlocksRegExp: js.RegExp
    
    var inlineRegExp: js.RegExp
  }
  object DocBlocksRegExp {
    
    inline def apply(docBlocksRegExp: js.RegExp, inlineRegExp: js.RegExp): DocBlocksRegExp = {
      val __obj = js.Dynamic.literal(docBlocksRegExp = docBlocksRegExp.asInstanceOf[js.Any], inlineRegExp = inlineRegExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocBlocksRegExp]
    }
    
    extension [Self <: DocBlocksRegExp](x: Self) {
      
      inline def setDocBlocksRegExp(value: js.RegExp): Self = StObject.set(x, "docBlocksRegExp", value.asInstanceOf[js.Any])
      
      inline def setInlineRegExp(value: js.RegExp): Self = StObject.set(x, "inlineRegExp", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetGroup extends StObject {
    
    var getGroup: js.UndefOr[js.Function0[String]] = js.undefined
    
    var markdownFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var markdownRemovePTags: js.UndefOr[js.Array[String]] = js.undefined
    
    def parse(content: String, source: String, messages: String): Description
    
    var path: String
  }
  object GetGroup {
    
    inline def apply(parse: (String, String, String) => Description, path: String): GetGroup = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction3(parse), path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetGroup]
    }
    
    extension [Self <: GetGroup](x: Self) {
      
      inline def setGetGroup(value: CallbackTo[String]): Self = StObject.set(x, "getGroup", value.toJsFn)
      
      inline def setGetGroupUndefined: Self = StObject.set(x, "getGroup", js.undefined)
      
      inline def setMarkdownFields(value: js.Array[String]): Self = StObject.set(x, "markdownFields", value.asInstanceOf[js.Any])
      
      inline def setMarkdownFieldsUndefined: Self = StObject.set(x, "markdownFields", js.undefined)
      
      inline def setMarkdownFieldsVarargs(value: String*): Self = StObject.set(x, "markdownFields", js.Array(value*))
      
      inline def setMarkdownRemovePTags(value: js.Array[String]): Self = StObject.set(x, "markdownRemovePTags", value.asInstanceOf[js.Any])
      
      inline def setMarkdownRemovePTagsUndefined: Self = StObject.set(x, "markdownRemovePTags", js.undefined)
      
      inline def setMarkdownRemovePTagsVarargs(value: String*): Self = StObject.set(x, "markdownRemovePTags", js.Array(value*))
      
      inline def setParse(value: (String, String, String) => Description): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Global extends StObject {
    
    var global: Any
    
    var local: Any
  }
  object Global {
    
    inline def apply(global: Any, local: Any): Global = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setGlobal(value: Any): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: Any): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    }
  }
  
  trait PostFilter extends StObject {
    
    def postFilter(parsedFiles: js.Array[ParsedFile], parsedFilenames: js.Array[String]): Unit
  }
  object PostFilter {
    
    inline def apply(postFilter: (js.Array[ParsedFile], js.Array[String]) => Callback): PostFilter = {
      val __obj = js.Dynamic.literal(postFilter = js.Any.fromFunction2((t0: js.Array[ParsedFile], t1: js.Array[String]) => (postFilter(t0, t1)).runNow()))
      __obj.asInstanceOf[PostFilter]
    }
    
    extension [Self <: PostFilter](x: Self) {
      
      inline def setPostFilter(value: (js.Array[ParsedFile], js.Array[String]) => Callback): Self = StObject.set(x, "postFilter", js.Any.fromFunction2((t0: js.Array[ParsedFile], t1: js.Array[String]) => (value(t0, t1)).runNow()))
    }
  }
}
