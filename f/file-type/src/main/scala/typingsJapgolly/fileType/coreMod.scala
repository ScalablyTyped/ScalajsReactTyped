package typingsJapgolly.fileType

import typingsJapgolly.node.nodeColonstreamMod.Readable
import typingsJapgolly.std.ReadonlySet
import typingsJapgolly.strtok3.libTypesMod.ITokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("file-type/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileTypeFromBuffer(buffer: js.typedarray.ArrayBuffer): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  inline def fileTypeFromBuffer(buffer: js.typedarray.Uint8Array): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeFromStream(stream: Readable): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeFromTokenizer(tokenizer: ITokenizer): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromTokenizer")(tokenizer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeStream(readableStream: Readable): js.Promise[ReadableStreamWithFileType] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeStream")(readableStream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableStreamWithFileType]]
  inline def fileTypeStream(readableStream: Readable, options: StreamOptions): js.Promise[ReadableStreamWithFileType] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeStream")(readableStream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadableStreamWithFileType]]
  
  @JSImport("file-type/core", "supportedExtensions")
  @js.native
  val supportedExtensions: ReadonlySet[FileExtension] = js.native
  
  @JSImport("file-type/core", "supportedMimeTypes")
  @js.native
  val supportedMimeTypes: ReadonlySet[MimeType] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fileType.fileTypeStrings.jpg
    - typingsJapgolly.fileType.fileTypeStrings.png
    - typingsJapgolly.fileType.fileTypeStrings.apng
    - typingsJapgolly.fileType.fileTypeStrings.gif
    - typingsJapgolly.fileType.fileTypeStrings.webp
    - typingsJapgolly.fileType.fileTypeStrings.flif
    - typingsJapgolly.fileType.fileTypeStrings.xcf
    - typingsJapgolly.fileType.fileTypeStrings.cr2
    - typingsJapgolly.fileType.fileTypeStrings.cr3
    - typingsJapgolly.fileType.fileTypeStrings.orf
    - typingsJapgolly.fileType.fileTypeStrings.arw
    - typingsJapgolly.fileType.fileTypeStrings.dng
    - typingsJapgolly.fileType.fileTypeStrings.nef
    - typingsJapgolly.fileType.fileTypeStrings.rw2
    - typingsJapgolly.fileType.fileTypeStrings.raf
    - typingsJapgolly.fileType.fileTypeStrings.tif
    - typingsJapgolly.fileType.fileTypeStrings.bmp
    - typingsJapgolly.fileType.fileTypeStrings.icns
    - typingsJapgolly.fileType.fileTypeStrings.jxr
    - typingsJapgolly.fileType.fileTypeStrings.psd
    - typingsJapgolly.fileType.fileTypeStrings.indd
    - typingsJapgolly.fileType.fileTypeStrings.zip
    - typingsJapgolly.fileType.fileTypeStrings.tar
    - typingsJapgolly.fileType.fileTypeStrings.rar
    - typingsJapgolly.fileType.fileTypeStrings.gz
    - typingsJapgolly.fileType.fileTypeStrings.bz2
    - typingsJapgolly.fileType.fileTypeStrings.`7z`
    - typingsJapgolly.fileType.fileTypeStrings.dmg
    - typingsJapgolly.fileType.fileTypeStrings.mp4
    - typingsJapgolly.fileType.fileTypeStrings.mid
    - typingsJapgolly.fileType.fileTypeStrings.mkv
    - typingsJapgolly.fileType.fileTypeStrings.webm
    - typingsJapgolly.fileType.fileTypeStrings.mov
    - typingsJapgolly.fileType.fileTypeStrings.avi
    - typingsJapgolly.fileType.fileTypeStrings.mpg
    - typingsJapgolly.fileType.fileTypeStrings.mp2
    - typingsJapgolly.fileType.fileTypeStrings.mp3
    - typingsJapgolly.fileType.fileTypeStrings.m4a
    - typingsJapgolly.fileType.fileTypeStrings.ogg
    - typingsJapgolly.fileType.fileTypeStrings.opus
    - typingsJapgolly.fileType.fileTypeStrings.flac
    - typingsJapgolly.fileType.fileTypeStrings.wav
    - typingsJapgolly.fileType.fileTypeStrings.qcp
    - typingsJapgolly.fileType.fileTypeStrings.amr
    - typingsJapgolly.fileType.fileTypeStrings.pdf
    - typingsJapgolly.fileType.fileTypeStrings.epub
    - typingsJapgolly.fileType.fileTypeStrings.mobi
    - typingsJapgolly.fileType.fileTypeStrings.elf
    - typingsJapgolly.fileType.fileTypeStrings.exe
    - typingsJapgolly.fileType.fileTypeStrings.swf
    - typingsJapgolly.fileType.fileTypeStrings.rtf
    - typingsJapgolly.fileType.fileTypeStrings.woff
    - typingsJapgolly.fileType.fileTypeStrings.woff2
    - typingsJapgolly.fileType.fileTypeStrings.eot
    - typingsJapgolly.fileType.fileTypeStrings.ttf
    - typingsJapgolly.fileType.fileTypeStrings.otf
    - typingsJapgolly.fileType.fileTypeStrings.ico
    - typingsJapgolly.fileType.fileTypeStrings.flv
    - typingsJapgolly.fileType.fileTypeStrings.ps
    - typingsJapgolly.fileType.fileTypeStrings.xz
    - typingsJapgolly.fileType.fileTypeStrings.sqlite
    - typingsJapgolly.fileType.fileTypeStrings.nes
    - typingsJapgolly.fileType.fileTypeStrings.crx
    - typingsJapgolly.fileType.fileTypeStrings.xpi
    - typingsJapgolly.fileType.fileTypeStrings.cab
    - typingsJapgolly.fileType.fileTypeStrings.deb
    - typingsJapgolly.fileType.fileTypeStrings.ar
    - typingsJapgolly.fileType.fileTypeStrings.rpm
    - typingsJapgolly.fileType.fileTypeStrings.Z
    - typingsJapgolly.fileType.fileTypeStrings.lz
    - typingsJapgolly.fileType.fileTypeStrings.cfb
    - typingsJapgolly.fileType.fileTypeStrings.mxf
    - typingsJapgolly.fileType.fileTypeStrings.mts
    - typingsJapgolly.fileType.fileTypeStrings.wasm
    - typingsJapgolly.fileType.fileTypeStrings.blend
    - typingsJapgolly.fileType.fileTypeStrings.bpg
    - typingsJapgolly.fileType.fileTypeStrings.docx
    - typingsJapgolly.fileType.fileTypeStrings.pptx
    - typingsJapgolly.fileType.fileTypeStrings.xlsx
    - typingsJapgolly.fileType.fileTypeStrings.`3gp`
    - typingsJapgolly.fileType.fileTypeStrings.`3g2`
    - typingsJapgolly.fileType.fileTypeStrings.jp2
    - typingsJapgolly.fileType.fileTypeStrings.jpm
    - typingsJapgolly.fileType.fileTypeStrings.jpx
    - typingsJapgolly.fileType.fileTypeStrings.mj2
    - typingsJapgolly.fileType.fileTypeStrings.aif
    - typingsJapgolly.fileType.fileTypeStrings.odt
    - typingsJapgolly.fileType.fileTypeStrings.ods
    - typingsJapgolly.fileType.fileTypeStrings.odp
    - typingsJapgolly.fileType.fileTypeStrings.xml
    - typingsJapgolly.fileType.fileTypeStrings.heic
    - typingsJapgolly.fileType.fileTypeStrings.cur
    - typingsJapgolly.fileType.fileTypeStrings.ktx
    - typingsJapgolly.fileType.fileTypeStrings.ape
    - typingsJapgolly.fileType.fileTypeStrings.wv
    - typingsJapgolly.fileType.fileTypeStrings.asf
    - typingsJapgolly.fileType.fileTypeStrings.dcm
    - typingsJapgolly.fileType.fileTypeStrings.mpc
    - typingsJapgolly.fileType.fileTypeStrings.ics
    - typingsJapgolly.fileType.fileTypeStrings.glb
    - typingsJapgolly.fileType.fileTypeStrings.pcap
    - typingsJapgolly.fileType.fileTypeStrings.dsf
    - typingsJapgolly.fileType.fileTypeStrings.lnk
    - typingsJapgolly.fileType.fileTypeStrings.alias
    - typingsJapgolly.fileType.fileTypeStrings.voc
    - typingsJapgolly.fileType.fileTypeStrings.ac3
    - typingsJapgolly.fileType.fileTypeStrings.m4b
    - typingsJapgolly.fileType.fileTypeStrings.m4p
    - typingsJapgolly.fileType.fileTypeStrings.m4v
    - typingsJapgolly.fileType.fileTypeStrings.f4a
    - typingsJapgolly.fileType.fileTypeStrings.f4b
    - typingsJapgolly.fileType.fileTypeStrings.f4p
    - typingsJapgolly.fileType.fileTypeStrings.f4v
    - typingsJapgolly.fileType.fileTypeStrings.mie
    - typingsJapgolly.fileType.fileTypeStrings.ogv
    - typingsJapgolly.fileType.fileTypeStrings.ogm
    - typingsJapgolly.fileType.fileTypeStrings.oga
    - typingsJapgolly.fileType.fileTypeStrings.spx
    - typingsJapgolly.fileType.fileTypeStrings.ogx
    - typingsJapgolly.fileType.fileTypeStrings.arrow
    - typingsJapgolly.fileType.fileTypeStrings.shp
    - typingsJapgolly.fileType.fileTypeStrings.aac
    - typingsJapgolly.fileType.fileTypeStrings.mp1
    - typingsJapgolly.fileType.fileTypeStrings.it
    - typingsJapgolly.fileType.fileTypeStrings.s3m
    - typingsJapgolly.fileType.fileTypeStrings.xm
    - typingsJapgolly.fileType.fileTypeStrings.ai
    - typingsJapgolly.fileType.fileTypeStrings.skp
    - typingsJapgolly.fileType.fileTypeStrings.avif
    - typingsJapgolly.fileType.fileTypeStrings.eps
    - typingsJapgolly.fileType.fileTypeStrings.lzh
    - typingsJapgolly.fileType.fileTypeStrings.pgp
    - typingsJapgolly.fileType.fileTypeStrings.asar
    - typingsJapgolly.fileType.fileTypeStrings.stl
    - typingsJapgolly.fileType.fileTypeStrings.chm
    - typingsJapgolly.fileType.fileTypeStrings.`3mf`
    - typingsJapgolly.fileType.fileTypeStrings.zst
    - typingsJapgolly.fileType.fileTypeStrings.jxl
    - typingsJapgolly.fileType.fileTypeStrings.vcf
  */
  trait FileExtension extends StObject
  object FileExtension {
    
    inline def `3g2`: typingsJapgolly.fileType.fileTypeStrings.`3g2` = "3g2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`3g2`]
    
    inline def `3gp`: typingsJapgolly.fileType.fileTypeStrings.`3gp` = "3gp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`3gp`]
    
    inline def `3mf`: typingsJapgolly.fileType.fileTypeStrings.`3mf` = "3mf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`3mf`]
    
    inline def `7z`: typingsJapgolly.fileType.fileTypeStrings.`7z` = "7z".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`7z`]
    
    inline def Z: typingsJapgolly.fileType.fileTypeStrings.Z = "Z".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.Z]
    
    inline def aac: typingsJapgolly.fileType.fileTypeStrings.aac = "aac".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.aac]
    
    inline def ac3: typingsJapgolly.fileType.fileTypeStrings.ac3 = "ac3".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ac3]
    
    inline def ai: typingsJapgolly.fileType.fileTypeStrings.ai = "ai".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ai]
    
    inline def aif: typingsJapgolly.fileType.fileTypeStrings.aif = "aif".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.aif]
    
    inline def alias: typingsJapgolly.fileType.fileTypeStrings.alias = "alias".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.alias]
    
    inline def amr: typingsJapgolly.fileType.fileTypeStrings.amr = "amr".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.amr]
    
    inline def ape: typingsJapgolly.fileType.fileTypeStrings.ape = "ape".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ape]
    
    inline def apng: typingsJapgolly.fileType.fileTypeStrings.apng = "apng".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.apng]
    
    inline def ar: typingsJapgolly.fileType.fileTypeStrings.ar = "ar".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ar]
    
    inline def arrow: typingsJapgolly.fileType.fileTypeStrings.arrow = "arrow".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.arrow]
    
    inline def arw: typingsJapgolly.fileType.fileTypeStrings.arw = "arw".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.arw]
    
    inline def asar: typingsJapgolly.fileType.fileTypeStrings.asar = "asar".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.asar]
    
    inline def asf: typingsJapgolly.fileType.fileTypeStrings.asf = "asf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.asf]
    
    inline def avi: typingsJapgolly.fileType.fileTypeStrings.avi = "avi".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.avi]
    
    inline def avif: typingsJapgolly.fileType.fileTypeStrings.avif = "avif".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.avif]
    
    inline def blend: typingsJapgolly.fileType.fileTypeStrings.blend = "blend".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.blend]
    
    inline def bmp: typingsJapgolly.fileType.fileTypeStrings.bmp = "bmp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.bmp]
    
    inline def bpg: typingsJapgolly.fileType.fileTypeStrings.bpg = "bpg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.bpg]
    
    inline def bz2: typingsJapgolly.fileType.fileTypeStrings.bz2 = "bz2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.bz2]
    
    inline def cab: typingsJapgolly.fileType.fileTypeStrings.cab = "cab".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.cab]
    
    inline def cfb: typingsJapgolly.fileType.fileTypeStrings.cfb = "cfb".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.cfb]
    
    inline def chm: typingsJapgolly.fileType.fileTypeStrings.chm = "chm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.chm]
    
    inline def cr2: typingsJapgolly.fileType.fileTypeStrings.cr2 = "cr2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.cr2]
    
    inline def cr3: typingsJapgolly.fileType.fileTypeStrings.cr3 = "cr3".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.cr3]
    
    inline def crx: typingsJapgolly.fileType.fileTypeStrings.crx = "crx".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.crx]
    
    inline def cur: typingsJapgolly.fileType.fileTypeStrings.cur = "cur".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.cur]
    
    inline def dcm: typingsJapgolly.fileType.fileTypeStrings.dcm = "dcm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.dcm]
    
    inline def deb: typingsJapgolly.fileType.fileTypeStrings.deb = "deb".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.deb]
    
    inline def dmg: typingsJapgolly.fileType.fileTypeStrings.dmg = "dmg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.dmg]
    
    inline def dng: typingsJapgolly.fileType.fileTypeStrings.dng = "dng".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.dng]
    
    inline def docx: typingsJapgolly.fileType.fileTypeStrings.docx = "docx".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.docx]
    
    inline def dsf: typingsJapgolly.fileType.fileTypeStrings.dsf = "dsf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.dsf]
    
    inline def elf: typingsJapgolly.fileType.fileTypeStrings.elf = "elf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.elf]
    
    inline def eot: typingsJapgolly.fileType.fileTypeStrings.eot = "eot".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.eot]
    
    inline def eps: typingsJapgolly.fileType.fileTypeStrings.eps = "eps".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.eps]
    
    inline def epub: typingsJapgolly.fileType.fileTypeStrings.epub = "epub".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.epub]
    
    inline def exe: typingsJapgolly.fileType.fileTypeStrings.exe = "exe".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.exe]
    
    inline def f4a: typingsJapgolly.fileType.fileTypeStrings.f4a = "f4a".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.f4a]
    
    inline def f4b: typingsJapgolly.fileType.fileTypeStrings.f4b = "f4b".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.f4b]
    
    inline def f4p: typingsJapgolly.fileType.fileTypeStrings.f4p = "f4p".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.f4p]
    
    inline def f4v: typingsJapgolly.fileType.fileTypeStrings.f4v = "f4v".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.f4v]
    
    inline def flac: typingsJapgolly.fileType.fileTypeStrings.flac = "flac".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.flac]
    
    inline def flif: typingsJapgolly.fileType.fileTypeStrings.flif = "flif".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.flif]
    
    inline def flv: typingsJapgolly.fileType.fileTypeStrings.flv = "flv".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.flv]
    
    inline def gif: typingsJapgolly.fileType.fileTypeStrings.gif = "gif".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.gif]
    
    inline def glb: typingsJapgolly.fileType.fileTypeStrings.glb = "glb".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.glb]
    
    inline def gz: typingsJapgolly.fileType.fileTypeStrings.gz = "gz".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.gz]
    
    inline def heic: typingsJapgolly.fileType.fileTypeStrings.heic = "heic".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.heic]
    
    inline def icns: typingsJapgolly.fileType.fileTypeStrings.icns = "icns".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.icns]
    
    inline def ico: typingsJapgolly.fileType.fileTypeStrings.ico = "ico".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ico]
    
    inline def ics: typingsJapgolly.fileType.fileTypeStrings.ics = "ics".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ics]
    
    inline def indd: typingsJapgolly.fileType.fileTypeStrings.indd = "indd".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.indd]
    
    inline def it: typingsJapgolly.fileType.fileTypeStrings.it = "it".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.it]
    
    inline def jp2: typingsJapgolly.fileType.fileTypeStrings.jp2 = "jp2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.jp2]
    
    inline def jpg: typingsJapgolly.fileType.fileTypeStrings.jpg = "jpg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.jpg]
    
    inline def jpm: typingsJapgolly.fileType.fileTypeStrings.jpm = "jpm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.jpm]
    
    inline def jpx: typingsJapgolly.fileType.fileTypeStrings.jpx = "jpx".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.jpx]
    
    inline def jxl: typingsJapgolly.fileType.fileTypeStrings.jxl = "jxl".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.jxl]
    
    inline def jxr: typingsJapgolly.fileType.fileTypeStrings.jxr = "jxr".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.jxr]
    
    inline def ktx: typingsJapgolly.fileType.fileTypeStrings.ktx = "ktx".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ktx]
    
    inline def lnk: typingsJapgolly.fileType.fileTypeStrings.lnk = "lnk".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.lnk]
    
    inline def lz: typingsJapgolly.fileType.fileTypeStrings.lz = "lz".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.lz]
    
    inline def lzh: typingsJapgolly.fileType.fileTypeStrings.lzh = "lzh".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.lzh]
    
    inline def m4a: typingsJapgolly.fileType.fileTypeStrings.m4a = "m4a".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.m4a]
    
    inline def m4b: typingsJapgolly.fileType.fileTypeStrings.m4b = "m4b".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.m4b]
    
    inline def m4p: typingsJapgolly.fileType.fileTypeStrings.m4p = "m4p".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.m4p]
    
    inline def m4v: typingsJapgolly.fileType.fileTypeStrings.m4v = "m4v".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.m4v]
    
    inline def mid: typingsJapgolly.fileType.fileTypeStrings.mid = "mid".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mid]
    
    inline def mie: typingsJapgolly.fileType.fileTypeStrings.mie = "mie".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mie]
    
    inline def mj2: typingsJapgolly.fileType.fileTypeStrings.mj2 = "mj2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mj2]
    
    inline def mkv: typingsJapgolly.fileType.fileTypeStrings.mkv = "mkv".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mkv]
    
    inline def mobi: typingsJapgolly.fileType.fileTypeStrings.mobi = "mobi".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mobi]
    
    inline def mov: typingsJapgolly.fileType.fileTypeStrings.mov = "mov".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mov]
    
    inline def mp1: typingsJapgolly.fileType.fileTypeStrings.mp1 = "mp1".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mp1]
    
    inline def mp2: typingsJapgolly.fileType.fileTypeStrings.mp2 = "mp2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mp2]
    
    inline def mp3: typingsJapgolly.fileType.fileTypeStrings.mp3 = "mp3".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mp3]
    
    inline def mp4: typingsJapgolly.fileType.fileTypeStrings.mp4 = "mp4".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mp4]
    
    inline def mpc: typingsJapgolly.fileType.fileTypeStrings.mpc = "mpc".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mpc]
    
    inline def mpg: typingsJapgolly.fileType.fileTypeStrings.mpg = "mpg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mpg]
    
    inline def mts: typingsJapgolly.fileType.fileTypeStrings.mts = "mts".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mts]
    
    inline def mxf: typingsJapgolly.fileType.fileTypeStrings.mxf = "mxf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.mxf]
    
    inline def nef: typingsJapgolly.fileType.fileTypeStrings.nef = "nef".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.nef]
    
    inline def nes: typingsJapgolly.fileType.fileTypeStrings.nes = "nes".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.nes]
    
    inline def odp: typingsJapgolly.fileType.fileTypeStrings.odp = "odp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.odp]
    
    inline def ods: typingsJapgolly.fileType.fileTypeStrings.ods = "ods".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ods]
    
    inline def odt: typingsJapgolly.fileType.fileTypeStrings.odt = "odt".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.odt]
    
    inline def oga: typingsJapgolly.fileType.fileTypeStrings.oga = "oga".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.oga]
    
    inline def ogg: typingsJapgolly.fileType.fileTypeStrings.ogg = "ogg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ogg]
    
    inline def ogm: typingsJapgolly.fileType.fileTypeStrings.ogm = "ogm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ogm]
    
    inline def ogv: typingsJapgolly.fileType.fileTypeStrings.ogv = "ogv".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ogv]
    
    inline def ogx: typingsJapgolly.fileType.fileTypeStrings.ogx = "ogx".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ogx]
    
    inline def opus: typingsJapgolly.fileType.fileTypeStrings.opus = "opus".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.opus]
    
    inline def orf: typingsJapgolly.fileType.fileTypeStrings.orf = "orf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.orf]
    
    inline def otf: typingsJapgolly.fileType.fileTypeStrings.otf = "otf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.otf]
    
    inline def pcap: typingsJapgolly.fileType.fileTypeStrings.pcap = "pcap".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.pcap]
    
    inline def pdf: typingsJapgolly.fileType.fileTypeStrings.pdf = "pdf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.pdf]
    
    inline def pgp: typingsJapgolly.fileType.fileTypeStrings.pgp = "pgp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.pgp]
    
    inline def png: typingsJapgolly.fileType.fileTypeStrings.png = "png".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.png]
    
    inline def pptx: typingsJapgolly.fileType.fileTypeStrings.pptx = "pptx".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.pptx]
    
    inline def ps: typingsJapgolly.fileType.fileTypeStrings.ps = "ps".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ps]
    
    inline def psd: typingsJapgolly.fileType.fileTypeStrings.psd = "psd".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.psd]
    
    inline def qcp: typingsJapgolly.fileType.fileTypeStrings.qcp = "qcp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.qcp]
    
    inline def raf: typingsJapgolly.fileType.fileTypeStrings.raf = "raf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.raf]
    
    inline def rar: typingsJapgolly.fileType.fileTypeStrings.rar = "rar".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.rar]
    
    inline def rpm: typingsJapgolly.fileType.fileTypeStrings.rpm = "rpm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.rpm]
    
    inline def rtf: typingsJapgolly.fileType.fileTypeStrings.rtf = "rtf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.rtf]
    
    inline def rw2: typingsJapgolly.fileType.fileTypeStrings.rw2 = "rw2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.rw2]
    
    inline def s3m: typingsJapgolly.fileType.fileTypeStrings.s3m = "s3m".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.s3m]
    
    inline def shp: typingsJapgolly.fileType.fileTypeStrings.shp = "shp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.shp]
    
    inline def skp: typingsJapgolly.fileType.fileTypeStrings.skp = "skp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.skp]
    
    inline def spx: typingsJapgolly.fileType.fileTypeStrings.spx = "spx".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.spx]
    
    inline def sqlite: typingsJapgolly.fileType.fileTypeStrings.sqlite = "sqlite".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.sqlite]
    
    inline def stl: typingsJapgolly.fileType.fileTypeStrings.stl = "stl".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.stl]
    
    inline def swf: typingsJapgolly.fileType.fileTypeStrings.swf = "swf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.swf]
    
    inline def tar: typingsJapgolly.fileType.fileTypeStrings.tar = "tar".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.tar]
    
    inline def tif: typingsJapgolly.fileType.fileTypeStrings.tif = "tif".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.tif]
    
    inline def ttf: typingsJapgolly.fileType.fileTypeStrings.ttf = "ttf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.ttf]
    
    inline def vcf: typingsJapgolly.fileType.fileTypeStrings.vcf = "vcf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.vcf]
    
    inline def voc: typingsJapgolly.fileType.fileTypeStrings.voc = "voc".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.voc]
    
    inline def wasm: typingsJapgolly.fileType.fileTypeStrings.wasm = "wasm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.wasm]
    
    inline def wav: typingsJapgolly.fileType.fileTypeStrings.wav = "wav".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.wav]
    
    inline def webm: typingsJapgolly.fileType.fileTypeStrings.webm = "webm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.webm]
    
    inline def webp: typingsJapgolly.fileType.fileTypeStrings.webp = "webp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.webp]
    
    inline def woff: typingsJapgolly.fileType.fileTypeStrings.woff = "woff".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.woff]
    
    inline def woff2: typingsJapgolly.fileType.fileTypeStrings.woff2 = "woff2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.woff2]
    
    inline def wv: typingsJapgolly.fileType.fileTypeStrings.wv = "wv".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.wv]
    
    inline def xcf: typingsJapgolly.fileType.fileTypeStrings.xcf = "xcf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.xcf]
    
    inline def xlsx: typingsJapgolly.fileType.fileTypeStrings.xlsx = "xlsx".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.xlsx]
    
    inline def xm: typingsJapgolly.fileType.fileTypeStrings.xm = "xm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.xm]
    
    inline def xml: typingsJapgolly.fileType.fileTypeStrings.xml = "xml".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.xml]
    
    inline def xpi: typingsJapgolly.fileType.fileTypeStrings.xpi = "xpi".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.xpi]
    
    inline def xz: typingsJapgolly.fileType.fileTypeStrings.xz = "xz".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.xz]
    
    inline def zip: typingsJapgolly.fileType.fileTypeStrings.zip = "zip".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.zip]
    
    inline def zst: typingsJapgolly.fileType.fileTypeStrings.zst = "zst".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.zst]
  }
  
  trait FileTypeResult extends StObject {
    
    /**
    	One of the supported [file types](https://github.com/sindresorhus/file-type#supported-file-types).
    	*/
    val ext: FileExtension
    
    /**
    	The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
    	*/
    val mime: MimeType
  }
  object FileTypeResult {
    
    inline def apply(ext: FileExtension, mime: MimeType): FileTypeResult = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileTypeResult]
    }
    
    extension [Self <: FileTypeResult](x: Self) {
      
      inline def setExt(value: FileExtension): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setMime(value: MimeType): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
  
  object MimeType {
    
    inline def applicationSlashdicom: typingsJapgolly.fileType.fileTypeStrings.applicationSlashdicom = "application/dicom".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashdicom]
    
    inline def applicationSlasheps: typingsJapgolly.fileType.fileTypeStrings.applicationSlasheps = "application/eps".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlasheps]
    
    inline def applicationSlashepubPlussignzip: typingsJapgolly.fileType.fileTypeStrings.applicationSlashepubPlussignzip = "application/epub+zip".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashepubPlussignzip]
    
    inline def applicationSlashgzip: typingsJapgolly.fileType.fileTypeStrings.applicationSlashgzip = "application/gzip".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashgzip]
    
    inline def applicationSlashmxf: typingsJapgolly.fileType.fileTypeStrings.applicationSlashmxf = "application/mxf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashmxf]
    
    inline def applicationSlashogg: typingsJapgolly.fileType.fileTypeStrings.applicationSlashogg = "application/ogg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashogg]
    
    inline def applicationSlashpdf: typingsJapgolly.fileType.fileTypeStrings.applicationSlashpdf = "application/pdf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashpdf]
    
    inline def `applicationSlashpgp-encrypted`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashpgp-encrypted` = "application/pgp-encrypted".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashpgp-encrypted`]
    
    inline def applicationSlashpostscript: typingsJapgolly.fileType.fileTypeStrings.applicationSlashpostscript = "application/postscript".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashpostscript]
    
    inline def applicationSlashrtf: typingsJapgolly.fileType.fileTypeStrings.applicationSlashrtf = "application/rtf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashrtf]
    
    inline def `applicationSlashvndDotms-asf`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-asf` = "application/vnd.ms-asf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-asf`]
    
    inline def `applicationSlashvndDotms-cab-compressed`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed` = "application/vnd.ms-cab-compressed".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed`]
    
    inline def `applicationSlashvndDotms-fontobject`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject` = "application/vnd.ms-fontobject".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject`]
    
    inline def `applicationSlashvndDotms-htmlhelp`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-htmlhelp` = "application/vnd.ms-htmlhelp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-htmlhelp`]
    
    inline def applicationSlashvndDotoasisDotopendocumentDotpresentation: typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation = "application/vnd.oasis.opendocument.presentation".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation]
    
    inline def applicationSlashvndDotoasisDotopendocumentDotspreadsheet: typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet = "application/vnd.oasis.opendocument.spreadsheet".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet]
    
    inline def applicationSlashvndDotoasisDotopendocumentDottext: typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext = "application/vnd.oasis.opendocument.text".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext]
    
    inline def `applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation`: /* application/vnd.openxmlformats-officedocument.presentationml.presentation */ String = "application/vnd.openxmlformats-officedocument.presentationml.presentation".asInstanceOf[/* application/vnd.openxmlformats-officedocument.presentationml.presentation */ String]
    
    inline def `applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet`: /* application/vnd.openxmlformats-officedocument.spreadsheetml.sheet */ String = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".asInstanceOf[/* application/vnd.openxmlformats-officedocument.spreadsheetml.sheet */ String]
    
    inline def `applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument`: /* application/vnd.openxmlformats-officedocument.wordprocessingml.document */ String = "application/vnd.openxmlformats-officedocument.wordprocessingml.document".asInstanceOf[/* application/vnd.openxmlformats-officedocument.wordprocessingml.document */ String]
    
    inline def applicationSlashvndDotsketchupDotskp: typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp = "application/vnd.sketchup.skp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp]
    
    inline def applicationSlashvndDottcpdumpDotpcap: typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap = "application/vnd.tcpdump.pcap".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap]
    
    inline def applicationSlashwasm: typingsJapgolly.fileType.fileTypeStrings.applicationSlashwasm = "application/wasm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashwasm]
    
    inline def `applicationSlashx-7z-compressed`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-7z-compressed` = "application/x-7z-compressed".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-7z-compressed`]
    
    inline def `applicationSlashx-apache-arrow`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-apache-arrow` = "application/x-apache-arrow".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-apache-arrow`]
    
    inline def `applicationSlashx-apple-diskimage`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage` = "application/x-apple-diskimage".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage`]
    
    inline def `applicationSlashx-asar`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-asar` = "application/x-asar".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-asar`]
    
    inline def `applicationSlashx-blender`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-blender` = "application/x-blender".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-blender`]
    
    inline def `applicationSlashx-bzip2`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-bzip2` = "application/x-bzip2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-bzip2`]
    
    inline def `applicationSlashx-cfb`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-cfb` = "application/x-cfb".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-cfb`]
    
    inline def `applicationSlashx-compress`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-compress` = "application/x-compress".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-compress`]
    
    inline def `applicationSlashx-deb`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-deb` = "application/x-deb".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-deb`]
    
    inline def `applicationSlashx-elf`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-elf` = "application/x-elf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-elf`]
    
    inline def `applicationSlashx-esri-shape`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-esri-shape` = "application/x-esri-shape".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-esri-shape`]
    
    inline def `applicationSlashx-google-chrome-extension`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension` = "application/x-google-chrome-extension".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension`]
    
    inline def `applicationSlashx-indesign`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-indesign` = "application/x-indesign".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-indesign`]
    
    inline def `applicationSlashx-lzh-compressed`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed` = "application/x-lzh-compressed".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed`]
    
    inline def `applicationSlashx-lzip`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-lzip` = "application/x-lzip".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-lzip`]
    
    inline def `applicationSlashx-mie`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-mie` = "application/x-mie".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-mie`]
    
    inline def `applicationSlashx-mobipocket-ebook`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook` = "application/x-mobipocket-ebook".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook`]
    
    inline def `applicationSlashx-msdownload`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-msdownload` = "application/x-msdownload".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-msdownload`]
    
    inline def `applicationSlashx-nintendo-nes-rom`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom` = "application/x-nintendo-nes-rom".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom`]
    
    inline def `applicationSlashx-rar-compressed`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-rar-compressed` = "application/x-rar-compressed".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-rar-compressed`]
    
    inline def `applicationSlashx-rpm`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-rpm` = "application/x-rpm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-rpm`]
    
    inline def `applicationSlashx-shockwave-flash`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash` = "application/x-shockwave-flash".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash`]
    
    inline def `applicationSlashx-sqlite3`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-sqlite3` = "application/x-sqlite3".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-sqlite3`]
    
    inline def `applicationSlashx-tar`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-tar` = "application/x-tar".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-tar`]
    
    inline def `applicationSlashx-unix-archive`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-unix-archive` = "application/x-unix-archive".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-unix-archive`]
    
    inline def `applicationSlashx-xpinstall`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-xpinstall` = "application/x-xpinstall".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-xpinstall`]
    
    inline def `applicationSlashx-xz`: typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-xz` = "application/x-xz".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-xz`]
    
    inline def applicationSlashxDotappleDotalias: typingsJapgolly.fileType.fileTypeStrings.applicationSlashxDotappleDotalias = "application/x.apple.alias".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashxDotappleDotalias]
    
    inline def applicationSlashxDotmsDotshortcut: typingsJapgolly.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut = "application/x.ms.shortcut".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut]
    
    inline def applicationSlashxml: typingsJapgolly.fileType.fileTypeStrings.applicationSlashxml = "application/xml".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashxml]
    
    inline def applicationSlashzip: typingsJapgolly.fileType.fileTypeStrings.applicationSlashzip = "application/zip".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashzip]
    
    inline def applicationSlashzstd: typingsJapgolly.fileType.fileTypeStrings.applicationSlashzstd = "application/zstd".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.applicationSlashzstd]
    
    inline def audioSlashaac: typingsJapgolly.fileType.fileTypeStrings.audioSlashaac = "audio/aac".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashaac]
    
    inline def audioSlashaiff: typingsJapgolly.fileType.fileTypeStrings.audioSlashaiff = "audio/aiff".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashaiff]
    
    inline def audioSlashamr: typingsJapgolly.fileType.fileTypeStrings.audioSlashamr = "audio/amr".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashamr]
    
    inline def audioSlashape: typingsJapgolly.fileType.fileTypeStrings.audioSlashape = "audio/ape".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashape]
    
    inline def audioSlashmidi: typingsJapgolly.fileType.fileTypeStrings.audioSlashmidi = "audio/midi".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashmidi]
    
    inline def audioSlashmp4: typingsJapgolly.fileType.fileTypeStrings.audioSlashmp4 = "audio/mp4".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashmp4]
    
    inline def audioSlashmpeg: typingsJapgolly.fileType.fileTypeStrings.audioSlashmpeg = "audio/mpeg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashmpeg]
    
    inline def audioSlashogg: typingsJapgolly.fileType.fileTypeStrings.audioSlashogg = "audio/ogg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashogg]
    
    inline def audioSlashopus: typingsJapgolly.fileType.fileTypeStrings.audioSlashopus = "audio/opus".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashopus]
    
    inline def audioSlashqcelp: typingsJapgolly.fileType.fileTypeStrings.audioSlashqcelp = "audio/qcelp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashqcelp]
    
    inline def `audioSlashvndDotdolbyDotdd-raw`: typingsJapgolly.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw` = "audio/vnd.dolby.dd-raw".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw`]
    
    inline def audioSlashvndDotwave: typingsJapgolly.fileType.fileTypeStrings.audioSlashvndDotwave = "audio/vnd.wave".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashvndDotwave]
    
    inline def audioSlashwavpack: typingsJapgolly.fileType.fileTypeStrings.audioSlashwavpack = "audio/wavpack".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.audioSlashwavpack]
    
    inline def `audioSlashx-dsf`: typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-dsf` = "audio/x-dsf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-dsf`]
    
    inline def `audioSlashx-flac`: typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-flac` = "audio/x-flac".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-flac`]
    
    inline def `audioSlashx-it`: typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-it` = "audio/x-it".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-it`]
    
    inline def `audioSlashx-m4a`: typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-m4a` = "audio/x-m4a".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-m4a`]
    
    inline def `audioSlashx-ms-asf`: typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-ms-asf` = "audio/x-ms-asf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-ms-asf`]
    
    inline def `audioSlashx-musepack`: typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-musepack` = "audio/x-musepack".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-musepack`]
    
    inline def `audioSlashx-s3m`: typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-s3m` = "audio/x-s3m".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-s3m`]
    
    inline def `audioSlashx-voc`: typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-voc` = "audio/x-voc".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-voc`]
    
    inline def `audioSlashx-xm`: typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-xm` = "audio/x-xm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-xm`]
    
    inline def fontSlashotf: typingsJapgolly.fileType.fileTypeStrings.fontSlashotf = "font/otf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.fontSlashotf]
    
    inline def fontSlashttf: typingsJapgolly.fileType.fileTypeStrings.fontSlashttf = "font/ttf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.fontSlashttf]
    
    inline def fontSlashwoff: typingsJapgolly.fileType.fileTypeStrings.fontSlashwoff = "font/woff".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.fontSlashwoff]
    
    inline def fontSlashwoff2: typingsJapgolly.fileType.fileTypeStrings.fontSlashwoff2 = "font/woff2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.fontSlashwoff2]
    
    inline def imageSlashapng: typingsJapgolly.fileType.fileTypeStrings.imageSlashapng = "image/apng".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashapng]
    
    inline def imageSlashavif: typingsJapgolly.fileType.fileTypeStrings.imageSlashavif = "image/avif".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashavif]
    
    inline def imageSlashbmp: typingsJapgolly.fileType.fileTypeStrings.imageSlashbmp = "image/bmp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashbmp]
    
    inline def imageSlashbpg: typingsJapgolly.fileType.fileTypeStrings.imageSlashbpg = "image/bpg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashbpg]
    
    inline def imageSlashflif: typingsJapgolly.fileType.fileTypeStrings.imageSlashflif = "image/flif".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashflif]
    
    inline def imageSlashgif: typingsJapgolly.fileType.fileTypeStrings.imageSlashgif = "image/gif".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashgif]
    
    inline def imageSlashheic: typingsJapgolly.fileType.fileTypeStrings.imageSlashheic = "image/heic".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashheic]
    
    inline def `imageSlashheic-sequence`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashheic-sequence` = "image/heic-sequence".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashheic-sequence`]
    
    inline def imageSlashheif: typingsJapgolly.fileType.fileTypeStrings.imageSlashheif = "image/heif".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashheif]
    
    inline def `imageSlashheif-sequence`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashheif-sequence` = "image/heif-sequence".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashheif-sequence`]
    
    inline def imageSlashicns: typingsJapgolly.fileType.fileTypeStrings.imageSlashicns = "image/icns".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashicns]
    
    inline def imageSlashjp2: typingsJapgolly.fileType.fileTypeStrings.imageSlashjp2 = "image/jp2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashjp2]
    
    inline def imageSlashjpeg: typingsJapgolly.fileType.fileTypeStrings.imageSlashjpeg = "image/jpeg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashjpeg]
    
    inline def imageSlashjpm: typingsJapgolly.fileType.fileTypeStrings.imageSlashjpm = "image/jpm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashjpm]
    
    inline def imageSlashjpx: typingsJapgolly.fileType.fileTypeStrings.imageSlashjpx = "image/jpx".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashjpx]
    
    inline def imageSlashjxl: typingsJapgolly.fileType.fileTypeStrings.imageSlashjxl = "image/jxl".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashjxl]
    
    inline def imageSlashktx: typingsJapgolly.fileType.fileTypeStrings.imageSlashktx = "image/ktx".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashktx]
    
    inline def imageSlashmj2: typingsJapgolly.fileType.fileTypeStrings.imageSlashmj2 = "image/mj2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashmj2]
    
    inline def imageSlashpng: typingsJapgolly.fileType.fileTypeStrings.imageSlashpng = "image/png".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashpng]
    
    inline def imageSlashtiff: typingsJapgolly.fileType.fileTypeStrings.imageSlashtiff = "image/tiff".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashtiff]
    
    inline def imageSlashvndDotadobeDotphotoshop: typingsJapgolly.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop = "image/vnd.adobe.photoshop".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop]
    
    inline def `imageSlashvndDotms-photo`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashvndDotms-photo` = "image/vnd.ms-photo".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashvndDotms-photo`]
    
    inline def imageSlashwebp: typingsJapgolly.fileType.fileTypeStrings.imageSlashwebp = "image/webp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.imageSlashwebp]
    
    inline def `imageSlashx-adobe-dng`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-adobe-dng` = "image/x-adobe-dng".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-adobe-dng`]
    
    inline def `imageSlashx-canon-cr2`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-canon-cr2` = "image/x-canon-cr2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-canon-cr2`]
    
    inline def `imageSlashx-canon-cr3`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-canon-cr3` = "image/x-canon-cr3".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-canon-cr3`]
    
    inline def `imageSlashx-fujifilm-raf`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf` = "image/x-fujifilm-raf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf`]
    
    inline def `imageSlashx-icon`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-icon` = "image/x-icon".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-icon`]
    
    inline def `imageSlashx-nikon-nef`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-nikon-nef` = "image/x-nikon-nef".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-nikon-nef`]
    
    inline def `imageSlashx-olympus-orf`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-olympus-orf` = "image/x-olympus-orf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-olympus-orf`]
    
    inline def `imageSlashx-panasonic-rw2`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2` = "image/x-panasonic-rw2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2`]
    
    inline def `imageSlashx-sony-arw`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-sony-arw` = "image/x-sony-arw".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-sony-arw`]
    
    inline def `imageSlashx-xcf`: typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-xcf` = "image/x-xcf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-xcf`]
    
    inline def modelSlash3mf: typingsJapgolly.fileType.fileTypeStrings.modelSlash3mf = "model/3mf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.modelSlash3mf]
    
    inline def `modelSlashgltf-binary`: typingsJapgolly.fileType.fileTypeStrings.`modelSlashgltf-binary` = "model/gltf-binary".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`modelSlashgltf-binary`]
    
    inline def modelSlashstl: typingsJapgolly.fileType.fileTypeStrings.modelSlashstl = "model/stl".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.modelSlashstl]
    
    inline def textSlashcalendar: typingsJapgolly.fileType.fileTypeStrings.textSlashcalendar = "text/calendar".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.textSlashcalendar]
    
    inline def textSlashvcard: typingsJapgolly.fileType.fileTypeStrings.textSlashvcard = "text/vcard".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.textSlashvcard]
    
    inline def videoSlash3gpp: typingsJapgolly.fileType.fileTypeStrings.videoSlash3gpp = "video/3gpp".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.videoSlash3gpp]
    
    inline def videoSlash3gpp2: typingsJapgolly.fileType.fileTypeStrings.videoSlash3gpp2 = "video/3gpp2".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.videoSlash3gpp2]
    
    inline def videoSlashMP1S: typingsJapgolly.fileType.fileTypeStrings.videoSlashMP1S = "video/MP1S".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.videoSlashMP1S]
    
    inline def videoSlashMP2P: typingsJapgolly.fileType.fileTypeStrings.videoSlashMP2P = "video/MP2P".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.videoSlashMP2P]
    
    inline def videoSlashmp2t: typingsJapgolly.fileType.fileTypeStrings.videoSlashmp2t = "video/mp2t".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.videoSlashmp2t]
    
    inline def videoSlashmp4: typingsJapgolly.fileType.fileTypeStrings.videoSlashmp4 = "video/mp4".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.videoSlashmp4]
    
    inline def videoSlashmpeg: typingsJapgolly.fileType.fileTypeStrings.videoSlashmpeg = "video/mpeg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.videoSlashmpeg]
    
    inline def videoSlashogg: typingsJapgolly.fileType.fileTypeStrings.videoSlashogg = "video/ogg".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.videoSlashogg]
    
    inline def videoSlashquicktime: typingsJapgolly.fileType.fileTypeStrings.videoSlashquicktime = "video/quicktime".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.videoSlashquicktime]
    
    inline def videoSlashvndDotavi: typingsJapgolly.fileType.fileTypeStrings.videoSlashvndDotavi = "video/vnd.avi".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.videoSlashvndDotavi]
    
    inline def videoSlashwebm: typingsJapgolly.fileType.fileTypeStrings.videoSlashwebm = "video/webm".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.videoSlashwebm]
    
    inline def `videoSlashx-flv`: typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-flv` = "video/x-flv".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-flv`]
    
    inline def `videoSlashx-m4v`: typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-m4v` = "video/x-m4v".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-m4v`]
    
    inline def `videoSlashx-matroska`: typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-matroska` = "video/x-matroska".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-matroska`]
    
    inline def `videoSlashx-ms-asf`: typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-ms-asf` = "video/x-ms-asf".asInstanceOf[typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-ms-asf`]
  }
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashjpeg
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashpng
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashgif
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashwebp
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashflif
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-xcf`
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-canon-cr2`
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-canon-cr3`
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashtiff
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashbmp
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashicns
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashvndDotms-photo`
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-indesign`
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashepubPlussignzip
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-xpinstall`
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation
    - / * application/vnd.openxmlformats-officedocument.wordprocessingml.document * / java.lang.String
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashzip
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-tar`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-rar-compressed`
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashgzip
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-bzip2`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-7z-compressed`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage`
    - typingsJapgolly.fileType.fileTypeStrings.videoSlashmp4
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashmidi
    - typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-matroska`
    - typingsJapgolly.fileType.fileTypeStrings.videoSlashwebm
    - typingsJapgolly.fileType.fileTypeStrings.videoSlashquicktime
    - typingsJapgolly.fileType.fileTypeStrings.videoSlashvndDotavi
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashvndDotwave
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashqcelp
    - typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-ms-asf`
    - typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-ms-asf`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-asf`
    - typingsJapgolly.fileType.fileTypeStrings.videoSlashmpeg
    - typingsJapgolly.fileType.fileTypeStrings.videoSlash3gpp
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashmpeg
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashmp4
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashopus
    - typingsJapgolly.fileType.fileTypeStrings.videoSlashogg
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashogg
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashogg
    - typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-flac`
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashape
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashwavpack
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashamr
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashpdf
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-elf`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-msdownload`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash`
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashrtf
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashwasm
    - typingsJapgolly.fileType.fileTypeStrings.fontSlashwoff
    - typingsJapgolly.fileType.fileTypeStrings.fontSlashwoff2
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject`
    - typingsJapgolly.fileType.fileTypeStrings.fontSlashttf
    - typingsJapgolly.fileType.fileTypeStrings.fontSlashotf
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-icon`
    - typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-flv`
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashpostscript
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlasheps
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-xz`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-sqlite3`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-deb`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-unix-archive`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-rpm`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-compress`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-lzip`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-cfb`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-mie`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-apache-arrow`
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashmxf
    - typingsJapgolly.fileType.fileTypeStrings.videoSlashmp2t
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-blender`
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashbpg
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashjp2
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashjpx
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashjpm
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashmj2
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashaiff
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashxml
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook`
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashheif
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashheif-sequence`
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashheic
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashheic-sequence`
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashktx
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashdicom
    - typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-musepack`
    - typingsJapgolly.fileType.fileTypeStrings.textSlashcalendar
    - typingsJapgolly.fileType.fileTypeStrings.textSlashvcard
    - typingsJapgolly.fileType.fileTypeStrings.`modelSlashgltf-binary`
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap
    - typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-dsf`
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashxDotappleDotalias
    - typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-voc`
    - typingsJapgolly.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw`
    - typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-m4a`
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashapng
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-olympus-orf`
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-sony-arw`
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-adobe-dng`
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-nikon-nef`
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2`
    - typingsJapgolly.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf`
    - typingsJapgolly.fileType.fileTypeStrings.`videoSlashx-m4v`
    - typingsJapgolly.fileType.fileTypeStrings.videoSlash3gpp2
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-esri-shape`
    - typingsJapgolly.fileType.fileTypeStrings.audioSlashaac
    - typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-it`
    - typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-s3m`
    - typingsJapgolly.fileType.fileTypeStrings.`audioSlashx-xm`
    - typingsJapgolly.fileType.fileTypeStrings.videoSlashMP1S
    - typingsJapgolly.fileType.fileTypeStrings.videoSlashMP2P
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashavif
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashpgp-encrypted`
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashx-asar`
    - typingsJapgolly.fileType.fileTypeStrings.modelSlashstl
    - typingsJapgolly.fileType.fileTypeStrings.`applicationSlashvndDotms-htmlhelp`
    - typingsJapgolly.fileType.fileTypeStrings.modelSlash3mf
    - typingsJapgolly.fileType.fileTypeStrings.imageSlashjxl
    - typingsJapgolly.fileType.fileTypeStrings.applicationSlashzstd
  */
  type MimeType = _MimeType | (/* application/vnd.openxmlformats-officedocument.wordprocessingml.document */ String)
  
  @js.native
  trait ReadableStreamWithFileType extends Readable {
    
    val fileType: js.UndefOr[FileTypeResult] = js.native
  }
  
  trait StreamOptions extends StObject {
    
    /**
    	The default sample size in bytes.
    	@default 4100
    	*/
    val sampleSize: js.UndefOr[Double] = js.undefined
  }
  object StreamOptions {
    
    inline def apply(): StreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOptions]
    }
    
    extension [Self <: StreamOptions](x: Self) {
      
      inline def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
      
      inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    }
  }
  
  trait _MimeType extends StObject
}
