package typingsJapgolly.sshConfig

import typingsJapgolly.sshConfig.mod.ELine.COMMENT
import typingsJapgolly.sshConfig.mod.ELine.DIRECTIVE
import typingsJapgolly.sshConfig.sshConfigStrings.Equalssign
import typingsJapgolly.sshConfig.sshConfigStrings.Space
import typingsJapgolly.std.Array
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssh-config", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SSHConfig[Line]
  
  @js.native
  sealed trait ELine extends StObject
  @JSImport("ssh-config", "ELine")
  @js.native
  object ELine extends StObject {
    
    @js.native
    sealed trait COMMENT
      extends StObject
         with ELine
    
    @js.native
    sealed trait DIRECTIVE
      extends StObject
         with ELine
  }
  
  trait Comment
    extends StObject
       with Line {
    
    var content: String
    
    var `type`: COMMENT
  }
  object Comment {
    
    inline def apply(content: String, `type`: COMMENT): Comment = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setType(value: COMMENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Directive
    extends StObject
       with Line {
    
    var after: String
    
    var before: String
    
    var param: String
    
    var separator: Space | Equalssign
    
    var `type`: DIRECTIVE
    
    var value: String
  }
  object Directive {
    
    inline def apply(
      after: String,
      before: String,
      param: String,
      separator: Space | Equalssign,
      `type`: DIRECTIVE,
      value: String
    ): Directive = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directive]
    }
    
    extension [Self <: Directive](x: Self) {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setSeparator(value: Space | Equalssign): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setType(value: DIRECTIVE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sshConfig.mod.Section
    - typingsJapgolly.sshConfig.mod.Directive
    - typingsJapgolly.sshConfig.mod.Comment
  */
  trait Line extends StObject
  object Line {
    
    inline def Comment(content: String, `type`: COMMENT): typingsJapgolly.sshConfig.mod.Comment = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.sshConfig.mod.Comment]
    }
    
    inline def Directive(
      after: String,
      before: String,
      param: String,
      separator: Space | Equalssign,
      `type`: DIRECTIVE,
      value: String
    ): typingsJapgolly.sshConfig.mod.Directive = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.sshConfig.mod.Directive]
    }
    
    inline def Section(
      after: String,
      before: String,
      config: SSHConfig[Line],
      param: String,
      separator: Space | Equalssign,
      `type`: DIRECTIVE,
      value: String
    ): typingsJapgolly.sshConfig.mod.Section = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.sshConfig.mod.Section]
    }
  }
  
  @js.native
  trait SSHConfig[T]
    extends StObject
       with Array[T] {
    
    def append(options: Record[String, String]): SSHConfig[Line] = js.native
    
    def compute(host: String): Record[String, String] = js.native
    
    def find(options: Record[String, String]): Line | Section = js.native
    
    def prepend(options: Record[String, String]): SSHConfig[Line] = js.native
    
    def remove(options: Record[String, String]): Line | Section = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.sshConfig.mod.Line because Already inherited */ trait Section
    extends StObject
       with Directive {
    
    var config: SSHConfig[Line]
  }
  object Section {
    
    inline def apply(
      after: String,
      before: String,
      config: SSHConfig[Line],
      param: String,
      separator: Space | Equalssign,
      `type`: DIRECTIVE,
      value: String
    ): Section = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Section]
    }
    
    extension [Self <: Section](x: Self) {
      
      inline def setConfig(value: SSHConfig[Line]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
