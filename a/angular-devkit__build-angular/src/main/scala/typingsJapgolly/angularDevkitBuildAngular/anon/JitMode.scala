package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularCompilerCli.linkerBabelSrcBabelCoreMod.PluginObj
import typingsJapgolly.angularCompilerCli.linkerBabelSrcLinkerPluginOptionsMod.LinkerPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JitMode extends StObject {
  
  var jitMode: Boolean
  
  def linkerPluginCreator(hasFileSystemLoggerOptions: LinkerPluginOptions): PluginObj
  @JSName("linkerPluginCreator")
  var linkerPluginCreator_Original: js.Function1[/* hasFileSystemLoggerOptions */ LinkerPluginOptions, PluginObj]
  
  var shouldLink: Boolean
}
object JitMode {
  
  inline def apply(
    jitMode: Boolean,
    linkerPluginCreator: /* hasFileSystemLoggerOptions */ LinkerPluginOptions => PluginObj,
    shouldLink: Boolean
  ): JitMode = {
    val __obj = js.Dynamic.literal(jitMode = jitMode.asInstanceOf[js.Any], linkerPluginCreator = js.Any.fromFunction1(linkerPluginCreator), shouldLink = shouldLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[JitMode]
  }
  
  extension [Self <: JitMode](x: Self) {
    
    inline def setJitMode(value: Boolean): Self = StObject.set(x, "jitMode", value.asInstanceOf[js.Any])
    
    inline def setLinkerPluginCreator(value: /* hasFileSystemLoggerOptions */ LinkerPluginOptions => PluginObj): Self = StObject.set(x, "linkerPluginCreator", js.Any.fromFunction1(value))
    
    inline def setShouldLink(value: Boolean): Self = StObject.set(x, "shouldLink", value.asInstanceOf[js.Any])
  }
}
