package typingsJapgolly.tempWrite

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    // eslint-disable-line unicorn/prevent-abbreviations
    /**
    	Write string/buffer/stream to a random temp file.
    	@param fileContent - Data to write to the temp file.
    	@param filePath - Optionally supply a file path which is appended to the random path. Example: `'img.png'` `'foo/bar/baz.png'`.
    	@returns The file path of the temp file.
    	@example
    	```
    	import fs from 'node:fs/promises';
    	import tempWrite from 'temp-write';
    	const filePath = await tempWrite('unicorn');
    	//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b'
    	await fs.readFile(filePath, 'utf8');
    	//=> 'unicorn'
    	await tempWrite('unicorn', 'pony.png');
    	//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b/pony.png'
    	await tempWrite('unicorn', 'rainbow/cake/pony.png');
    	//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b/rainbow/cake/pony.png'
    	```
    	*/
    inline def apply(fileContent: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(fileContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def apply(fileContent: String, filePath: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(fileContent.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def apply(fileContent: ReadableStream): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(fileContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def apply(fileContent: ReadableStream, filePath: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(fileContent.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def apply(fileContent: Buffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(fileContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def apply(fileContent: Buffer, filePath: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(fileContent.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    @JSImport("temp-write", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Synchronously write string/buffer/stream to a random temp file.
    	@param fileContent - Data to write to the temp file.
    	@param filePath - Optionally supply a file path which is appended to the random path. Example: `'img.png'` `'foo/bar/baz.png'`.
    	@returns The file path of the temp file.
    	@example
    	```
    	import fs from 'node:fs';
    	import tempWrite from 'temp-write';
    	const filePath = tempWrite.sync('unicorn');
    	//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b'
    	fs.readFileSync(filePath, 'utf8');
    	//=> 'unicorn'
    	tempWrite.sync('unicorn', 'pony.png');
    	//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b/pony.png'
    	tempWrite.sync('unicorn', 'rainbow/cake/pony.png');
    	//=> '/var/folders/_1/tk89k8215ts0rg0kmb096nj80000gn/T/4049f192-43e7-43b2-98d9-094e6760861b/rainbow/cake/pony.png'
    	```
    	*/
    inline def sync(fileContent: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(fileContent.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def sync(fileContent: String, filePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(fileContent.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def sync(fileContent: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(fileContent.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def sync(fileContent: Buffer, filePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(fileContent.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
